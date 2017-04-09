package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Erin on 23/03/2017.
 */

public class spellingtest5 extends AppCompatActivity {

    private EditText spellingBox;
    private String word = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest5);
        spellingBox = (EditText) findViewById(R.id.Testfive);
        TextView WordFive = (TextView) findViewById(R.id.WordFive);

        word = MyGenerator.genWord(10);
        WordFive.setText(word);

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
    }

    // Test user-entered string against correct value
    public void validate(View v) {
        String a = spellingBox.getText().toString();

        if (a.equals(word)){          //increments correctness counter
            MyApplication.incrementCorrectSpellings();
        }
        MyTimer.instance().interrupt();
       // nextTest();
    }

    // Proceed to next test
    public void nextTest() {
        Intent intent = new Intent(spellingtest5.this, TestTwoIntro.class);
        startActivity(intent);
    }
}