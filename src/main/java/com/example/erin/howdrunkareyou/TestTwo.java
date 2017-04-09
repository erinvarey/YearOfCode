package com.example.erin.howdrunkareyou;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;

import junit.framework.Test;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 * Created by Erin on 27/03/2017.
 */

public class TestTwo extends AppCompatActivity {

    private ArrayList<Integer> clickIDS = new ArrayList<>();
    private Integer goodCount = 0;

    private ObjectAnimator animation;
    private ObjectAnimator animation2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testtwo);

        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
                .findViewById(android.R.id.content)).getChildAt(0);

        animation = ObjectAnimator.ofFloat(viewGroup, "rotationY", 0.0f, 360f);
        animation.setDuration(7000);
        animation.setRepeatCount(0);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.start();

        MyTimer stopwatch = MyTimer.instance();
        stopwatch.setTime(15000);
        // Method to call after timeout
        stopwatch.setCallback(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                if (animation.isRunning()) animation.end();
                if (animation2 != null) animation2.end();
                nextTest();
                return null;
            }
        });

        stopwatch.start();
    }

    public void goodClick(View v){
        if (v != null){
            Integer id = v.getId();
            if (!clickIDS.contains(id)) {
                clickIDS.add(id);
                goodCount++;
                Log.d("myTag", "Good click");
                System.out.println("test");
            }
            if (clickIDS.size() == 3){
                final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
                        .findViewById(android.R.id.content)).getChildAt(0);
                animation2 = ObjectAnimator.ofFloat(viewGroup, "rotationY", 0.0f, 360f);
                animation2.setDuration(7000);
                animation2.setRepeatCount(0);
                animation2.setInterpolator(new AccelerateDecelerateInterpolator());
                animation2.start();
            }
        }
    }

    public void badClick(View v){
        goodCount--;
        Log.d("myTag", "Bad click");
    }

    public void nextTest(View v){
        nextTest();
    }

    private void nextTest(){
        MyApplication.setTaps(goodCount);
        Intent intent = new Intent(TestTwo.this, TestThreeIntro.class);
        startActivity(intent);
    }
}
