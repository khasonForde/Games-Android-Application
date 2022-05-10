package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class FortuneTeller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune_teller);
        Intent FortuneTellerIntent = new Intent(this, PoemResultsActivity.class);
        EditText FortuneTellerEditText = (EditText) findViewById(R.id.editTextTextPersonName);
        String Username = FortuneTellerEditText.getText().toString();
        FortuneTellerIntent.putExtra("Username1", Username);
        startActivity(FortuneTellerIntent);
    }
}