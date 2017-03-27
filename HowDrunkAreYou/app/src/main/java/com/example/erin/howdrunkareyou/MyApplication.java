package com.example.erin.howdrunkareyou;

import android.app.Application;

/**
 * Created by Erin on 26/03/2017.
 */

public class MyApplication extends Application {
    public static Integer SpellingCorrect;
    public Integer GetSpellingCorrect() {
        return SpellingCorrect;
    }
    public void SetSpellingCorrect(Integer SpellingCorrect) {
        this.SpellingCorrect = SpellingCorrect;
    }
}
