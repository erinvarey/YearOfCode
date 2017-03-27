package com.example.erin.howdrunkareyou;

import android.app.Application;

/**
 * Created by Erin on 26/03/2017.
 */

public class MyApplication extends Application {
    public static Integer SpellingCorrect=0;
    public static Integer GetSpellingCorrect() {
        return SpellingCorrect;
    }
    public static void SetSpellingCorrect(Integer SpellingCorrectNew) {
        SpellingCorrect = SpellingCorrectNew;
    }
}