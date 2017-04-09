package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.Callable;

import java.util.Random;
import java.util.Timer;


/**
 * Created by Erin on 21/03/2017.
 */

//idea, implement 20 second timer to put some pressure.

public class spellingtest extends AppCompatActivity {
    private EditText Testone;
    static Integer count =0;
    static Integer s;
    static spellingtest var;
    static boolean one;
    public spellingtest(){
        var = this;
    }
    String word = "";
    long start = System.currentTimeMillis();
    long end = start + 20*1000; // 60 seconds * 1000 ms/sec
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest);
        Testone = (EditText) findViewById(R.id.Testone);
        s= ((MyApplication) this.getApplication()).GetSpellingCorrect();
        one=true;
        TextView WordOne = (TextView) findViewById(R.id.WordOne);
        String word = generateWord();
        WordOne.setText(word);
        MyTimer.getInstance().setCallback(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                TimeOut();
                return null;
            }
        });

        // another way
        MyTimer.getInstance().SetTimeOut(this, spellingtest2.class);
        MyTimer.getInstance().start();
    }
    public void TimeOut(){
            Intent intent = new Intent(spellingtest.this, spellingtest2.class);
            startActivity(intent);
            one = false;
    }
    public void SpellingSubmitOne(View v) {
            String a = Testone.getText().toString();
            //you got it right, get a point and move to next sentance
            if (a.equals(word.toString())) {
                Intent intent = new Intent(spellingtest.this, spellingtest2.class);
                startActivity(intent);
                //increments correctness counter. The range of scores well determine how drunk you are
                ((MyApplication) this.getApplication()).SetSpellingCorrect(s + 1);
                //  MyApplication.SpellingCorrect++;
                one = false;
            }
            //spelt incorrectly
            else {
                Intent intent = new Intent(spellingtest.this, spellingtest2.class);
                startActivity(intent);
                one = false;
            }

    }
    private String generateWord(){
        Random rand = new Random();
        String letters= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz()[]{}^*!@#$"; //64 characters long
       // String word = "";
        int num =rand.nextInt(64);
        while (word.length() < 10) {
            int index = (int) (rand.nextFloat() * letters.length());
            char c = letters.charAt(index);
            word=word+(String.valueOf(c));
        }
        return word;
    }
}

