package com.example.erin.howdrunkareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Erin on 30/03/2017.
 */

public class TestFour extends AppCompatActivity{
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.testthree);
        }
    Magicbutton.setOnClickListener(new OnClickListener() {


        @Override
        public void onClick(View v) {
            Magicbutton button = (Magicbutton) v;
            button.setVisibility(View.INVISIBLE);
        }
    };

}
