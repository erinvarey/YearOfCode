package com.example.erin.howdrunkareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by Erin on 23/03/2017.
 */

public class spellingtest3 extends AppCompatActivity {
    private EditText Testthree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest3);
        Testthree = (EditText) findViewById(R.id.Testthree);
    }
}
