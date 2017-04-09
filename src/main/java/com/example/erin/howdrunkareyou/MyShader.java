package com.example.erin.howdrunkareyou;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;


/**
 * Created by Nikhil on 4/9/2017.
 */

public class MyShader extends Thread {

    private View currentView;
    private int c;

    public MyShader(View view, int c){
        currentView = view;
        this.c = c;
    }

    @Override
    public void run(){
        currentView.setBackgroundColor(c);
    }

}
