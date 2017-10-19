package aemurill.assignment1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    private Button buttonEdit;
    private Button buttonView;
    private Button buttonExit;
    private Button buttonDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myEditButton = (Button) findViewById(R.id.editButton);
        Button myViewButton = (Button) findViewById(R.id.viewButton);
        Button myExitButton = (Button) findViewById(R.id.exitButton);
        Button myDoneButton = (Button) findViewById(R.id.doneButton);

        myEditButton.setOnClickListener(new View.OnClickListener() {
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
    }
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        buttonEdit = (Button) findViewById(R.id.button_edit);
//        buttonEdit.setOnClickListener(this);
//        buttonView = (Button) findViewById(R.id.button_view);
//        buttonView.setOnClickListener(this);
//        buttonExit = (Button) findViewById(R.id.button_exit);
//        buttonExit.setOnClickListener(this);
//        buttonDone = (Button) findViewById(R.id.button_done);
//        buttonDone.setOnClickListener(this);
//
//    }
//
//
//
//        @Override
//        public void onClick(View view){
//            switch (view.getId()){
//                case R.id.button_edit:
//                    Intent edit_intent = new Intent (MainActivity.this, EditActivity.class);
//                    startActivity(edit_intent);
//                    break;
//                case R.id.button_view:
//                    break;
//                case R.id.button_exit:
//                    break;
//                case R.id.button_done:
//                    Intent done_intent = new Intent (MainActivity.this, EditActivity.class);
//                    startActivity(done_intent);
//                    break;
//            }
//        }
}
