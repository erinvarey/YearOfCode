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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testthree);
        MathAnswerOne = (EditText) findViewById(R.id.MathAnswerOne);
        MathAnswerTwo = (EditText) findViewById(R.id.MathAnswerTwo);
        MathAnswerThree = (EditText) findViewById(R.id.MathAnswerThree);
        Integer grab = MyApplication.getMath();
    }
    public boolean MathRightOne() {
        String a = MathAnswerOne.getText().toString();
        Integer num = Integer.parseInt(a);
        Boolean answerone= (num == 17);

        String b=MathAnswerTwo.getText().toString();
        Integer num2= Integer.parseInt(b);
        Boolean answertwo= (num2==7);

        String c=MathAnswerThree.getText().toString();
        Integer num3= Integer.parseInt(c);
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
