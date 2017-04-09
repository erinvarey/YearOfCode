package com.example.erin.howdrunkareyou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Erin on 30/03/2017.
 */

public class Results extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        String spell = MyApplication.GetSpellingCorrect().toString();
        String precise = MyApplication.getPrecision().toString();
        String math= MyApplication.getMath().toString();

        TextView mathview = (TextView) findViewById(R.id.MathResult);
        mathview.setText(math);

        TextView spellview = (TextView) findViewById(R.id.SpellResult);
        spellview.setText(spell);

        TextView preciseview = (TextView) findViewById(R.id.PreciseResult);
        preciseview.setText(precise);
    }
}
