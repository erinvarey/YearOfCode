package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Erin on 21/03/2017.
 */

public class spellingtest extends AppCompatActivity {
    private EditText Testone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest);
        Testone = (EditText) findViewById(R.id.Testone);
    }
    public void SpellingSubmitOne(View v) {
        String a= Testone.getText().toString();
        Integer count =0;
        //you got it right, get a point and move to next sentance
        if(a.equals("This first sentence is going to be easy")) {
            Intent intent = new Intent(spellingtest.this, spellingtest2.class);
            startActivity(intent);
            //increments correctness counter. The range of scores well determine how drunk you are
            MainActivity.SpellingCorrect++;
        }
        //first try is wrong but you get two
        if((a.equals("This first sentence is going to be easy"))&&(count==0)){
            count++;
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();

        }
        //failed second try move on to next phrase
        else{
            Intent intent = new Intent(spellingtest.this, spellingtest2.class);
            startActivity(intent);
        }

    }
}

