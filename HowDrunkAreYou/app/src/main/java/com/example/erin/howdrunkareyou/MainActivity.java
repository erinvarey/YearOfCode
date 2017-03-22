package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static Integer SpellingCorrect;

    public Integer SpellingCorrect() {
        return SpellingCorrect;
    }

    public void SpellingCorrect(Integer SpellingCorrect) {
        this.SpellingCorrect = SpellingCorrect;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonTap(View v) {
        Intent intent = new Intent(MainActivity.this, spellingtest.class);
        startActivity(intent);
    }
}
