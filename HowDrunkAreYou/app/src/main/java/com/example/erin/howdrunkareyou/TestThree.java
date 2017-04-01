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
    private EditText MathAnswerOne;
    private EditText MathAnswerTwo;
    private EditText MathAnswerThree;
    Integer grab = MyApplication.getMath();

    private int answer1 = 0;
    private int answer2 = 0; //memes
    private int answer3 = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testthree);
        MathAnswerOne = (EditText) findViewById(R.id.MathAnswerOne);
        MathAnswerTwo = (EditText) findViewById(R.id.MathAnswerTwo);
        MathAnswerThree = (EditText) findViewById(R.id.MathAnswerThree);

        TextView MathOne = (TextView) findViewById(R.id.MathOne);
        String[] gen = generateMath();
        String math = gen[0];
        answer1 = Integer.parseInt(gen[1]);
        MathOne.setText(math);

        TextView MathTwo = (TextView) findViewById(R.id.MathTwo);
        gen = generateMath();
        math = gen[0];
        answer2 = Integer.parseInt(gen[1]);
        MathTwo.setText(math);

        TextView MathThree = (TextView) findViewById(R.id.MathThree);
        gen = generateMath();
        math = gen[0];
        answer3 = Integer.parseInt(gen[1]);
        MathThree.setText(math);
    }

    private String[] generateMath(){
        Random rand = new Random();
        String math = "";
        int nums[] = {rand.nextInt(15), rand.nextInt(15), rand.nextInt(300)};
        int answer = nums[0];
        math += nums[0];

        if (rand.nextBoolean()){
            math += "*";
            answer *= nums[1];
        }
        else{
            math += "+";
            answer += nums[1];
        }

        math += nums[1];

        if (rand.nextBoolean()){
            math += "+";
            answer += nums[2];
        }
        else{
            math += "-";
            answer -= nums[2];
        }

        math += nums[2];

        String[] output = new String[2];
        output[0] = math;
        output[1] = Integer.toString(answer);
        return output;
    }

    public int MathRightOne() {
        String a = MathAnswerOne.getText().toString();
        Integer num = 0;
        Integer num2 = 0;
        Integer num3 = 0;

        int correct = 0;

        try {
            num = Integer.parseInt(a);
        }catch(NumberFormatException e){

        }
        if (num == answer1){
            correct ++;
        }

        String b=MathAnswerTwo.getText().toString();
        try {
            num2= Integer.parseInt(b);
        }catch(NumberFormatException e){

        }
        if (num2==answer2){
            correct ++;
        }

        String c=MathAnswerThree.getText().toString();
        try {
            num3= Integer.parseInt(c);
        }catch(NumberFormatException e){

        }
        if (num3==answer3){
            correct ++;
        }

        return correct;
    }
    public void MathDone(View v){
       // if(MathRightOne()){
            MyApplication.setMath(MathRightOne());
            Intent intent = new Intent(TestThree.this, Results.class);
            startActivity(intent);
        //}
       /* else{
            Intent intent = new Intent(TestThree.this, Results.class);
            startActivity(intent);
        }
*/
    }
}
