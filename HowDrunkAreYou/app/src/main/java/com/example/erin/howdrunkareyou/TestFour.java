package com.example.erin.howdrunkareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.Callable;

/**
 * Created by Erin on 30/03/2017.
 */

public class TestFour extends AppCompatActivity{

    private Button inputOne;
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.testthree);
            inputOne = (Button) findViewById(R.id.Magicbutton);

            ReactionTimer stopwatch = ReactionTimer.instance();

            // Method to call after timeout
            stopwatch.setCallback(new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                  //nextactivity here
                    return null;
                }
            });

            stopwatch.start();

    inputOne.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            //inputOne button = (Magicbutton) v;
            inputOne.setVisibility(View.INVISIBLE);
        }
    });

    }
}