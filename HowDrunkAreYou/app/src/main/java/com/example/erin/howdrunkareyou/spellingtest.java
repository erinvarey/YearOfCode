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
 * Created by Erin on 21/03/2017.
 */

public class spellingtest extends AppCompatActivity {
    private EditText Testone;
    static Integer count =0;
    static Integer s;
    String word = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest);
        Testone = (EditText) findViewById(R.id.Testone);
        s= ((MyApplication) this.getApplication()).GetSpellingCorrect();

        TextView WordOne = (TextView) findViewById(R.id.WordOne);
        String word = generateWord();
        WordOne.setText(word);


    }
    public void SpellingSubmitOne(View v) {
        String a= Testone.getText().toString();
        //you got it right, get a point and move to next sentance
        if(a.equals(word.toString())) {
            Intent intent = new Intent(spellingtest.this, spellingtest2.class);
            startActivity(intent);
            //increments correctness counter. The range of scores well determine how drunk you are
            ((MyApplication) this.getApplication()).SetSpellingCorrect(s+1);
          //  MyApplication.SpellingCorrect++;
        }
        //first try is wrong but you get two
        /*else if((a.equals("This first sentence is going to be easy")==false)&&(count==0)){
            count++;
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();

        } */
        //failed second try move on to next phrase
        else{
            Intent intent = new Intent(spellingtest.this, spellingtest2.class);
            startActivity(intent);
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

