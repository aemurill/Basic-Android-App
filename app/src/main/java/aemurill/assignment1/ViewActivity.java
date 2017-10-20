package aemurill.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        StringBuilder text = new StringBuilder();

        try {
            // open the file for reading we have to surround it with a try
            InputStream inStream = openFileInput("myfilename.txt");//open the text file for reading
            // if file the available for reading
            if (inStream != null) {
                // prepare the file for reading
                InputStreamReader inputReader = new InputStreamReader(inStream);
                BufferedReader buffReader = new BufferedReader(inputReader);

                String line = "";
                //We initialize a string "line"

                while (( line = buffReader.readLine()) != null) {
                    //buffered reader reads only one line at a time, hence we give a while loop to read all till the text is null

                    text.append(line);
                    text.append('\n');    //to display the text in text line
                }}}

        //now we have to surround it with a catch statement for exceptions
        catch (IOException e) {
            e.printStackTrace();
        }

        //now we assign the text readed to the textview
        TextView tv = (TextView)findViewById(R.id.scrolltextview);
        tv.setText(text);
    }
}
