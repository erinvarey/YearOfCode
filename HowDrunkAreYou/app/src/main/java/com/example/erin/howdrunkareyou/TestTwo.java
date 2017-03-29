package com.example.erin.howdrunkareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Erin on 27/03/2017.
 */

public class TestTwo extends AppCompatActivity {
    public Integer goodCount=0;
    public Integer badCount=0;
    Integer grab = MyApplication.getPrecision();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testtwo);
    }
    public void GoodClick(View v){
        goodCount++;

    }
    public void badClick(View v){
        badCount++;
    }
    public void next(View v){
        Integer sum = goodCount=badCount;
        MyApplication.setPrecision(sum);
    }
}
