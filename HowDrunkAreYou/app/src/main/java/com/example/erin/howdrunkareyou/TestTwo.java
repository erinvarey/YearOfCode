package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by Erin on 27/03/2017.
 */

public class TestTwo extends AppCompatActivity {
    //this has a bug where if you keep hitting the button it jumps up good count
    //TO BE FIXED ONCE BETA IS DONE
    public Integer goodCount=0;
    //public Integer badCount=0;
    Integer grab = MyApplication.getPrecision();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testtwo);
    }
    public void GoodClick(View v){
        goodCount++;
        Log.d("myTag", "Good click");
    }
    public void badClick(View v){

        goodCount--;
        Log.d("myTag", "Bad click");
    }
    public void next(View v){
        Integer sum = (goodCount);
        MyApplication.setPrecision(sum);
        Intent intent = new Intent(TestTwo.this, TestThreeIntro.class);
        startActivity(intent);
    }
}
