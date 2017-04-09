package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Erin on 29/03/2017.
 */

public class TestThree extends AppCompatActivity {
    private EditText inputOne;
    private EditText inputTwo;
    private EditText inputThree;

    private int answer1 = 0;
    private int answer2 = 0;
    private int answer3 = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testthree);
        inputOne = (EditText) findViewById(R.id.MathAnswerOne);
        inputTwo = (EditText) findViewById(R.id.MathAnswerTwo);
        inputThree = (EditText) findViewById(R.id.MathAnswerThree);

        String[][] tests = {MyGenerator.genMath(), MyGenerator.genMath(), MyGenerator.genMath()};
        answer1 = Integer.parseInt(tests[0][1]);
        answer2 = Integer.parseInt(tests[1][1]);
        answer3 = Integer.parseInt(tests[2][1]);


        TextView eqn1 = (TextView) findViewById(R.id.MathOne);
        TextView eqn2 = (TextView) findViewById(R.id.MathTwo);
        TextView eqn3 = (TextView) findViewById(R.id.MathThree);

        eqn1.setText(tests[0][0]);
        eqn2.setText(tests[1][0]);
        eqn3.setText(tests[2][0]);
    }

    // Return number of correct responses
    public int corrects(){

        int correct = 0;
        String a = inputOne.getText().toString();
        String b= inputTwo.getText().toString();
        String c= inputThree.getText().toString();

        if (String.valueOf(answer1).equals(a.trim())) correct++;
        if (String.valueOf(answer2).equals(b.trim())) correct++;
        if (String.valueOf(answer3).equals(c.trim())) correct++;

        return correct;
    }

    // Set score and proceed to next test
    public void submit(View v){
        MyApplication.setRightCalcs(corrects());
        Intent intent = new Intent(TestThree.this, Results.class);
        startActivity(intent);
    }
}
