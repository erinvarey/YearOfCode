package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.Callable;

/**
 * Created by Erin on 21/03/2017.
 */

//idea, implement 20 second timer to put some pressure.

public class spellingtest extends AppCompatActivity {

    private EditText spellingBox;
    private String word = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest);
        spellingBox = (EditText) findViewById(R.id.Testone);

        word = MyGenerator.genWord(10);
        TextView stringDisplay = (TextView) findViewById(R.id.WordOne);
        stringDisplay.setText(word);

        MyTimer stopwatch = MyTimer.instance();

        // Method to call after timeout
        stopwatch.setCallback(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                nextTest();
                return null;
            }
        });

        stopwatch.start();
        shade();
    }

    // Test user-entered string against correct value
    public void validate(View v) {
        String a = spellingBox.getText().toString();

        if (a.equals(word)){          //increments correctness counter
            MyApplication.incrementCorrectSpellings();
        }
        nextTest();
    }

    // Proceed to next test
    private void nextTest() {
        Intent intent = new Intent(spellingtest.this, spellingtest2.class);
        startActivity(intent);
    }

    private void shade(){

        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
                .findViewById(android.R.id.content)).getChildAt(0);
        final Handler handler = new Handler();

        handler.postDelayed(new MyShader(viewGroup, Color.rgb(239, 100, 100))
                , 5000);
        handler.postDelayed(new MyShader(viewGroup, Color.rgb(179, 175, 255))
                , 10000);
        handler.postDelayed(new MyShader(viewGroup, Color.rgb(152, 255, 150))
                , 15000);
    }
}

