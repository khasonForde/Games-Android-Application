package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadlibsResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs_results);
        Intent intent = getIntent();
        String Verb1Input = intent.getStringExtra("Verb1String");
        String NounInput = intent.getStringExtra("NounString");
        String PartOfBodyInput = intent.getStringExtra("PartOfBodyString");
        String Verb2Input = intent.getStringExtra("Verb2String");
        String AnimalInput = intent.getStringExtra("AnimalString");
        String Verb3Input = intent.getStringExtra("Verb3String");
        TextView Output = (TextView) findViewById(R.id.textView10);
        Output.setText(fordeMadlibs(Verb1Input, NounInput, PartOfBodyInput, Verb1Input, AnimalInput, Verb3Input));
    }
    public static String fordeMadlibs(String verb1, String noun, String partOfBody, String verb2, String animal, String verb3) {
        return "I was " + verb1 + " down the hallway and some " + noun + " grabbed my " + partOfBody + ", and I turned to him and said \"so help me, if you " + verb2 + " me again you will go the way of the " + animal + "\". And then he " + verb3 + " away.";
    }
}