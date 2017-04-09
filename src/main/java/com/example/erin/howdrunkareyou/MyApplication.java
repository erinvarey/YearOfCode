package com.example.erin.howdrunkareyou;

import android.app.Application;

/**
 * Created by Erin on 26/03/2017.
 */

public class MyApplication extends Application {

    private static int taps = 0;
    private static int rightCalcs = 0;
    private static int correctSpellings = 0;

    public static int getCorrectSpellings() {
        return correctSpellings;
    }

    public static void incrementCorrectSpellings(){
        correctSpellings++;
    }

    public static int getTaps(){
        return taps;
    }
    public static void setTaps(int newTaps){
        taps = newTaps;
    }

    public static void sddTap(){
        taps++;
    }

    public static int getRightCalcs() {
        return rightCalcs;
    }

    public static void setRightCalcs(int MathNew){
        rightCalcs = MathNew;
    }

    public static void addRightCalc(int MathNew){
        rightCalcs = MathNew;
    }

}