package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Madlibs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
        Intent MadlibsIntent = new Intent(this, PoemResultsActivity.class);
        EditText MadlibsEditText1 = (EditText) findViewById(R.id.editTextTextPersonName6);
        EditText MadlibsEditText2 = (EditText) findViewById(R.id.editTextTextPersonName7);
        EditText MadlibsEditText3 = (EditText) findViewById(R.id.editTextTextPersonName8);
        EditText MadlibsEditText4 = (EditText) findViewById(R.id.editTextTextPersonName9);
        EditText MadlibsEditText5 = (EditText) findViewById(R.id.editTextTextPersonName10);
        EditText MadlibsEditText6 = (EditText) findViewById(R.id.editTextTextPersonName11);
        String Verb1 = MadlibsEditText1.getText().toString();
        String Noun = MadlibsEditText2.getText().toString();
        String PartOfBody = MadlibsEditText3.getText().toString();
        String Verb2 = MadlibsEditText4.getText().toString();
        String Animal = MadlibsEditText5.getText().toString();
        String Verb3 = MadlibsEditText6.getText().toString();
        MadlibsIntent.putExtra("Verb1String", Verb1);
        MadlibsIntent.putExtra("NounString", Noun);
        MadlibsIntent.putExtra("PartOfBodyString", PartOfBody);
        MadlibsIntent.putExtra("Verb2String", Verb2);
        MadlibsIntent.putExtra("AnimalString", Animal);
        MadlibsIntent.putExtra("Verb3String", Verb3 );
        startActivity(MadlibsIntent);
    }
}