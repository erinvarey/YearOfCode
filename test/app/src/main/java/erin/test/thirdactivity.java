package erin.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import erin.test.R;

/**
 * Created by Erin on 10/03/2017.
 */

public class thirdactivity extends AppCompatActivity{
        public EditText wordcheck;
        public EditText wordcheck1;
        public boolean b1=false;
        public boolean b2=false;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.thirdactivity);
            wordcheck =  (EditText) findViewById(R.id.wordcheck);
            wordcheck1 =  (EditText) findViewById(R.id.wordcheck1);

        }
        public boolean wordcheck(String s){
            if(s.equals("assuming")){
                b1=true;
                return b1;
            }
            else{
                b1=false;
                return b1;
            }

        }
        public boolean wordcheck1(String s){
            if(s.equals("difficult")){
                b2=true;
                return b2;
            }
            else{
                b2=false;
                return b2;
            }
        }
        public void ClickMethod(View v) {
            String a= wordcheck.getText().toString();
            String b= wordcheck1.getText().toString();
            boolean b1= wordcheck(a);
            boolean b2= wordcheck1(b);
            int count =0;
            if (b1 && b2) {
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "correct",
                        Toast.LENGTH_LONG);
                myToast.show();
            } else if((b1 & b2 == false)&& (count==0)){
                count++;
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "strike one",
                        Toast.LENGTH_LONG);
                myToast.show();
                }
            else if((b1 & b2 == false)&& (count==1)){
                count++;
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "strike two",
                        Toast.LENGTH_LONG);
                myToast.show();
            }
            else if((b1 & b2 == false)&& (count==2)){
                count++;
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "last try",
                        Toast.LENGTH_LONG);
                myToast.show();
            }
            else{
                count++;
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "You fail",
                        Toast.LENGTH_LONG);
                myToast.show();
            }


        }

}
