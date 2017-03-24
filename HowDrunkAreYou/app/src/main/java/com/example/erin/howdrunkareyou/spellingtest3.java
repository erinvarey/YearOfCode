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

public class spellingtest3 extends AppCompatActivity {
    private EditText Testthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest3);
        Testthree = (EditText) findViewById(R.id.Testthree);
    }
    public void SpellingSubmitThree(View v) {
        String a= Testthree.getText().toString();
        Integer count =0;
        //you got it right, get a point and move to next sentance
        if(a.equals("isn't it harder, with &^ symbols and (punctuation)")) {
            Intent intent = new Intent(spellingtest3.this, spellingtest4.class);
            startActivity(intent);
            //((MyApplication) this.getApplication()).setSpellingCorrect(1);
            //increments correctness counter. The range of scores well determine how drunk you are
            MainActivity.SpellingCorrect++;
        }
        //first try is wrong but you get two
        else if((a.equals("isn't it harder, with &^ symbols and (punctuation)")==false)&&(count==0)){
            Toast myToast = Toast.makeText(
                    getApplicationContext(),
                    "Please Try again",
                    Toast.LENGTH_LONG);
            myToast.show();
            count++;
        }
        //failed second try move on to next phrase
        else if((a.equals("isn't it harder, with &^ symbols and (punctuation)")==false)&&(count==1)){
            Intent intent = new Intent(spellingtest3.this, spellingtest4.class);
            startActivity(intent);
            //((MyApplication) this.getApplication()).setSpellingCorrect(1);
            MainActivity.SpellingCorrect++;
        }

    }
}
