package erin.test.thirdactivity;

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
        private EditText wordcheck;
        private EditText wordcheck1;
        public boolean b1=false;
        public boolean b2=false;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.thirdactivity);
        }
        public boolean wordcheck(String s){
            if(wordcheck.equals("assuming")){
                b1=true;
                return b1;
            }
            else{
                b1=false;
                return b1;
            }

        }
        public boolean wordcheck1(String s){
            if(wordcheck1.equals("difficult")){
                b2=true;
                return b2;
            }
            else{
                b2=false;
                return b2;
            }
        }
        public void onClick(View v){

            if(b1&&b2){
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "correct",
                        Toast.LENGTH_LONG);
                myToast.show();
            }
            else{
                Toast myToast = Toast.makeText(
                        getApplicationContext(),
                        "strike one",
                        Toast.LENGTH_LONG);
                myToast.show();
            }
        }

}
