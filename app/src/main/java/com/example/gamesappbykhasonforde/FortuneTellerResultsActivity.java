package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FortuneTellerResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune_teller_results);
        Intent intent = getIntent();
        String UsernameInput = intent.getStringExtra("Username1");
        TextView Output = (TextView) findViewById(R.id.textView8);
        Output.setText(fordeFortuneTeller(UsernameInput));
    }

    public static String fordeFortuneTeller(String username) {
        String[] fortuneList = {"You will win a million dollars soon.", "You will break your leg in six days.", "You will find the love of your life.", "You will get the job of your dreams soon.", "You will lose something dear to you."};
        int i = (int) (Math.random() * 5);
        return "Here is your fortune " + username + ": " + fortuneList[i];
    }
}