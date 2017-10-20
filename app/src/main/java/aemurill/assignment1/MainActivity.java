package aemurill.assignment1;

import android.content.Intent;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Button buttonEdit;
    private Button buttonView;
    private Button buttonExit;
    private Button buttonDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myEnterButton = (Button) findViewById(R.id.enterButton);
        Button myViewButton = (Button) findViewById(R.id.viewButton);
        Button myExitButton = (Button) findViewById(R.id.exitButton);
        Button myDoneButton = (Button) findViewById(R.id.doneButton);

        myEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text_1 = edit_text_1.getText().toString();

                Intent intent = new Intent(MainActivity.this, EditActivity.class);
                ////intent.putExtra("Text 2", edit_text_2.getText().toString());
                //Bundle bundle = new Bundle();
                //bundle.putString("Text 2", edit_text_2.getText().toString());
                //intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        myViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getApplication(),"i am cliked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                ////intent.putExtra("Text 2", edit_text_2.getText().toString());
                //Bundle bundle = new Bundle();
                //bundle.putString("Text 2", edit_text_2.getText().toString());
                //intent.putExtras(bundle);
                startActivity(intent);


//                ListViewAdapter adapter=new ListViewAdapter(DisplayAllRouteDetailActivity.this, list);
//                _display_all_routes_details.setAdapter(adapter);

            }
        });

        myExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
