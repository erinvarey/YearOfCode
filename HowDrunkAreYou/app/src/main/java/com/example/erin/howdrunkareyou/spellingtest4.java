package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Erin on 23/03/2017.
 */

public class spellingtest4 extends AppCompatActivity {
    private EditText Testfour;
    static Integer s;
    Integer count =0;
    String word = "";
    static spellingtest4 var;
    static boolean four = true;
    public spellingtest4(){
        var = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest4);
        Testfour = (EditText) findViewById(R.id.Testfour);
        s= ((MyApplication) this.getApplication()).GetSpellingCorrect();

        TextView WordFour = (TextView) findViewById(R.id.WordFour);
        String word = generateWord();
        WordFour.setText(word);

        Thread thread = new thread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void TimeOut(){
        Intent intent = new Intent(spellingtest4.this, spellingtest5.class);
        startActivity(intent);
        four = false;
    }
    public void SpellingSubmitFour(View v) {
        String a = Testfour.getText().toString();
        //you got it right, get a point and move to next sentance
        if (a.equals(word)) {
            Intent intent = new Intent(spellingtest4.this, spellingtest5.class);
            startActivity(intent);
            ((MyApplication) this.getApplication()).SetSpellingCorrect(s+1);
            four=false;
        }
        //first try is wrong but you get two
       /* else if ((a.equals("{This(Sentance[has]Nested)brackets}") == false) && (count == 0)) {
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();
            count++;
        } */
        //failed second try move on to next phrase
        else {
            Intent intent = new Intent(spellingtest4.this, spellingtest5.class);
            startActivity(intent);
            four=false;
            //((MyApplication) this.getApplication()).setSpellingCorrect(1);
         //   MainActivity.SpellingCorrect++;
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
