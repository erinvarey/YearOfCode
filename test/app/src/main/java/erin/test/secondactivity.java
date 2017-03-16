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
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
    }
    public void onClick(View v) {
        String one ="Test";
        if(count==0){
            one="Ouch!";
        }
        if (count ==1){
            one="Stop :(";
        }
        if (count ==2){
            one="I said stop";
        }
        if (count ==3){
            one="Do not boop me again";
        }
        if (count ==4){
            one="boop me one more time i dare you";
        }
        if (count ==5){
            one="wow really";
        }
        if (count ==6){
            one="i am ferocious you know";
        }
        if (count ==7){
            one="ferocious growling";
        }
        if (count ==8){
            one="fuck you";
        }
        if (count ==9){
            one="one more time mate";
        }
        if (count ==10){
            one="....";
            count =0;
            Intent intent = new Intent(secondactivity.this, thirdactivity.class);
            startActivity(intent);
        }
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                one,
                Toast.LENGTH_LONG);
        myToast.show();
        count++;
    }

       // Intent intent = new Intent(secondactivity.this, thirdactivity.class);
        //startActivity(intent);
}
