package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Erin on 23/03/2017.
 */

public class spellingtest5 extends AppCompatActivity {
    private EditText Testfive;
    static Integer s;
    Integer count=0;
    String word = "";
    static spellingtest5 var;
    static boolean five = true;
    public spellingtest5(){
        var = this;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest5);
        Testfive = (EditText) findViewById(R.id.Testfive);

        TextView WordFive = (TextView) findViewById(R.id.WordFive);
        String word = generateWord();
        WordFive.setText(word);

        MyTimer.getInstance().setCallback(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                TimeOut();
                return null;
            }
        });

        // another way
        MyTimer.getInstance().SetTimeOut(this, TestTwoIntro.class);
        MyTimer.getInstance().start();


    }
    public void TimeOut(){
        Intent intent = new Intent(spellingtest5.this, TestTwoIntro.class);
        startActivity(intent);
        five = false;
    }
    public void SpellingSubmitFive(View v) {
        String a = Testfive.getText().toString();
        s= ((MyApplication) this.getApplication()).GetSpellingCorrect();
        //you got it right, get a point and move to next sentance
        if (a.equals(word)) {
            Intent intent = new Intent(spellingtest5.this, TestTwoIntro.class);
            startActivity(intent);
            ((MyApplication) this.getApplication()).SetSpellingCorrect(s+1);
            five=false;
        }
        //first try is wrong but you get two
       /* else if ((a.equals("AltERnaTiNg bEtWeeN keYs TaKES fOcus") == false) && (count == 0)) {
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();
            count++;
        } */
        //failed second try move on to next phrase
        else {
            Intent intent = new Intent(spellingtest5.this, TestTwoIntro.class);
            startActivity(intent);
            five=false;
            //((MyApplication) this.getApplication()).setSpellingCorrect(1);
          //  MainActivity.SpellingCorrect++;
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

