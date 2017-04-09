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

public class spellingtest3 extends AppCompatActivity {
    private EditText Testthree;
    static Integer s;
    Integer count =0;
    String word ="";
    static spellingtest3 var;
    static boolean three = true;
    public spellingtest3(){
        var = this;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest3);
        Testthree = (EditText) findViewById(R.id.Testthree);
        s= ((MyApplication) this.getApplication()).GetSpellingCorrect();

        TextView WordThree = (TextView) findViewById(R.id.WordThree);
        String word = generateWord();
        WordThree.setText(word);

        MyTimer.getInstance().setCallback(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                TimeOut();
                return null;
            }
        });

        // another way
        MyTimer.getInstance().SetTimeOut(this, spellingtest4.class);
        MyTimer.getInstance().start();

    }
    public void TimeOut(){
        Intent intent = new Intent(spellingtest3.this, spellingtest4.class);
        startActivity(intent);
        three = false;
    }
    public void SpellingSubmitThree(View v) {
        String a= Testthree.getText().toString();

        //you got it right, get a point and move to next sentance
        if(a.equals(word)) {
            Intent intent = new Intent(spellingtest3.this, spellingtest4.class);
            startActivity(intent);
            ((MyApplication) this.getApplication()).SetSpellingCorrect(s+1);
            three=false;
        }
        //first try is wrong but you get two
       /* else if((a.equals("isn't it harder, with ^ symbols and (punctuation)")==false)&&(count==0)){
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();
            count++;
        } */
        //failed second try move on to next phrase
        else {
            Intent intent = new Intent(spellingtest3.this, spellingtest4.class);
            startActivity(intent);
            three=false;

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
