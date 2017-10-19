package aemurill.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonEdit = (Button) findViewById(R.id.button_edit);
        Button buttonView = (Button) findViewById(R.id.button_view);
        Button buttonExit = (Button) findViewById(R.id.button_exit);
        Button buttonDone = (Button) findViewById(R.id.button_done);
    }




        public void onClick(View view){
            switch (view.getId()){
                case R.id.button_edit:
                    Intent edit_intent = new Intent (MainActivity.this, EditActivity.class);
                    startActivity(edit_intent);
                    break;
                case R.id.button_view:
                    break;
                case R.id.button_exit:
                    break;
            }
        }
}
