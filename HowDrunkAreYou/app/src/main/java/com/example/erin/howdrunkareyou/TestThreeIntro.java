package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Erin on 29/03/2017.
 */

public class TestThreeIntro extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testthreeintro);
    }
    public void TestThreeGo(View v) {
        Intent intent = new Intent(TestThreeIntro.this, TestThree.class);
        startActivity(intent);
    }
}
