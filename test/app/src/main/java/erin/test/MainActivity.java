package erin.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonTap(View v){
        password = (EditText) findViewById(R.id.editText);
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "Ouch!",
                Toast.LENGTH_LONG);
        myToast.show();


    }
    //button = (button) findViewById(R.id.button);

    //Assign a listener to your button
      //  button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            //Start your second activity
            if(password.equals("GIVEMEDOGGO")) {
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                startActivity(intent);

            }
            else{
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "Please Try again",
                        Toast.LENGTH_LONG);
                myToast.show();

            }

        }
    }

