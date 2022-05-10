package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Lottery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery);
        Intent LotteryIntent = new Intent(this, PoemResultsActivity.class);
        EditText Pick1EditText = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText Pick2EditText = (EditText) findViewById(R.id.editTextTextPersonName4);
        EditText Pick3EditText = (EditText) findViewById(R.id.editTextTextPersonName5);
        String UserNum1 = Pick1EditText.getText().toString();
        String UserNum2 = Pick2EditText.getText().toString();
        String UserNum3 = Pick3EditText.getText().toString();
        LotteryIntent.putExtra("Num1", UserNum1);
        LotteryIntent.putExtra("Num2", UserNum2);
        LotteryIntent.putExtra("Num3", UserNum3);
        startActivity(LotteryIntent);
    }
}