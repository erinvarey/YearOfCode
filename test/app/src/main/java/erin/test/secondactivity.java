package erin.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Erin on 05/03/2017.
 */

public class secondactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
    }
    public void onClick(View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "Ouch!",
                Toast.LENGTH_LONG);
        myToast.show();
    }
       // Intent intent = new Intent(secondactivity.this, thirdactivity.class);
        //startActivity(intent);
}
