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
        password = (EditText) findViewById(R.id.editText);
    }

    public void onButtonTap(View v) {
        Intent intent = new Intent(MainActivity.this, thirdactivity.class);
        startActivity(intent);
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
       // Intent intent = new Intent(MainActivity.this, secondactivity.class);
       // startActivity(intent);
        //Start your second activity
        String a= password.getText().toString();
        if (a.equals("GIVEMEDOGGO")) {
            Intent intent = new Intent(MainActivity.this, secondactivity.class);
            startActivity(intent);

        } else {
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();

        }


    }
}

