package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PoemResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_results);
        Intent intent = getIntent();
        String NameInput = intent.getStringExtra("NameString");
        TextView Output = (TextView) findViewById(R.id.textView11);
        Output.setText(fordePoem(NameInput));
    }

    public static String fordePoem(String name) {
        return "My student " + name + ", standing proud, is a fine example for the crowd.";
    }
}