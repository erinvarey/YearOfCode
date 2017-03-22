package com.example.erin.howdrunkareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by Erin on 22/03/2017.
 */

public class spellingtest2  extends AppCompatActivity {
    private EditText Testone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellingtest);
        Testone = (EditText) findViewById(R.id.Testone);
    }
}
