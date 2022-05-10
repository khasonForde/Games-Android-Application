package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Poem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
        Intent PoemIntent = new Intent(this, PoemResultsActivity.class);
        EditText PoemEditText = (EditText) findViewById(R.id.editTextTextPersonName2);
        String name = PoemEditText.getText().toString();
        PoemIntent.putExtra("NameString", name);
        startActivity(PoemIntent);
    }

}