package com.example.erin.howdrunkareyou;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Erin on 27/03/2017.
 */

public class TestTwoIntro extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testtwointro);
    }

    public void onClick(View v) {
            Intent intent = new Intent(TestTwoIntro.this, TestTwo.class);
            startActivity(intent);
        }
}
