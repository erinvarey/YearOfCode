package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Erin on 29/03/2017.
 */

public class TestThree extends AppCompatActivity {
    private EditText MathAnswerOne;
    private EditText MathAnswerTwo;
    private EditText MathAnswerThree;
    Integer grab = MyApplication.getMath();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testthree);
        MathAnswerOne = (EditText) findViewById(R.id.MathAnswerOne);
        MathAnswerTwo = (EditText) findViewById(R.id.MathAnswerTwo);
        MathAnswerThree = (EditText) findViewById(R.id.MathAnswerThree);
    }
    public boolean MathRightOne() {
        String a = MathAnswerOne.getText().toString();
        Integer num = 0;
        Integer num2 = 0;
        Integer num3 = 0;
        try {
            num = Integer.parseInt(a);
        }catch(NumberFormatException e){

        }
        Boolean answerone= (num == 22);

        String b=MathAnswerTwo.getText().toString();
        try {
            num2= Integer.parseInt(b);
        }catch(NumberFormatException e){

        }
        Boolean answertwo= (num2==7);

        String c=MathAnswerThree.getText().toString();
        try {
            num3= Integer.parseInt(c);
        }catch(NumberFormatException e){

        }
        Boolean answerthree= (num3==47);

        return (answerone && answertwo && answerthree);
    }
    public void MathDone(View v){
        if(MathRightOne()){
            MyApplication.setMath(1);
            Intent intent = new Intent(TestThree.this, Results.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(TestThree.this, Results.class);
            startActivity(intent);
        }

    }
}
