package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Erin on 23/03/2017.
 */

public class spellingtest4 extends AppCompatActivity {
    private EditText Testfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest4);
        Testfour = (EditText) findViewById(R.id.Testfour);
    }

    public void SpellingSubmitFour(View v) {
        String a = Testfour.getText().toString();
        Integer count = 0;
        //you got it right, get a point and move to next sentance
        if (a.equals("{This(Sentance[has]Nested)brackets}")) {
            Intent intent = new Intent(spellingtest4.this, spellingtest5.class);
            startActivity(intent);
            //((MyApplication) this.getApplication()).setSpellingCorrect(1);
            //increments correctness counter. The range of scores well determine how drunk you are
           // MainActivity.SpellingCorrect++;
        }
        //first try is wrong but you get two
        else if ((a.equals("{This(Sentance[has]Nested)brackets}") == false) && (count == 0)) {
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();
            count++;
        }
        //failed second try move on to next phrase
        else if ((a.equals("{This(Sentance[has]Nested)brackets}") == false) && (count == 1)) {
            Intent intent = new Intent(spellingtest4.this, spellingtest5.class);
            startActivity(intent);
            //((MyApplication) this.getApplication()).setSpellingCorrect(1);
         //   MainActivity.SpellingCorrect++;
        }

    }
}