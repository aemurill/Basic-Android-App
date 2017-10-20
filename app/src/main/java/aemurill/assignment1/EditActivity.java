package aemurill.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Calendar;

public class EditActivity extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Spinner spinner = new Spinner(this);

        ArrayList<String> years = new ArrayList<String>();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = thisYear; i >= thisYear - 40; i--) {
            years.add(Integer.toString(i));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, years);

        Spinner spinYear = (Spinner)findViewById(R.id.yearSpinner);
        spinYear.setAdapter(adapter);
        Button doneButton = (Button) findViewById(R.id.doneButton);

            doneButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        // open myfilename.txt for writing
                        OutputStreamWriter out=new OutputStreamWriter(openFileOutput("myfilename.txt",MODE_APPEND));
                        // write the contents to the file

                        EditText nET = (EditText)findViewById(R.id.nameEditText);
                        Spinner ySpin = (Spinner) findViewById(R.id.yearSpinner);
                        EditText pET = (EditText)findViewById(R.id.photogEditText);
                        String text = nET.getText().toString() + " ";
                        text = text + ySpin.getSelectedItem().toString() + " ";
                        text = text + pET.getText().toString();
                        out.write(text);
                        out.write('\n');

                        // close the file

                        out.close();

                        Toast.makeText(EditActivity.this, "Text Saved!", Toast.LENGTH_LONG).show();
                    }

                    catch (java.io.IOException e) {
                        //do something if an IOException occurs.
                        Toast.makeText(EditActivity.this, "Sorry Text could't be added", Toast.LENGTH_LONG).show();
                    }
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
                    TextView tv = (TextView)findViewById(R.id.textView);
                    tv.setText(text);
                }
            });
    }
}
