package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LotteryResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery_results);
        Intent intent = getIntent();
        String LotteryPick1 = intent.getStringExtra("Num1");
        String LotteryPick2 = intent.getStringExtra("Num2");
        String LotteryPick3 = intent.getStringExtra("Num3");
        int LotteryNum1 = Integer.parseInt(LotteryPick1);
        int LotteryNum2 = Integer.parseInt(LotteryPick2);
        int LotteryNum3 = Integer.parseInt(LotteryPick3);
        TextView Output = (TextView) findViewById(R.id.textView8);
        Output.setText(fordeLottery(LotteryNum1, LotteryNum2, LotteryNum3 ));
    }

    public static String fordeLottery(int userNum1, int userNum2, int userNum3) {
        int WinNum1 = (int) (Math.random() * 9) + 1;
        int WinNum2 = (int) (Math.random() * 9) + 1;
        int WinNum3 = (int) (Math.random() * 9) + 1;

        if ((userNum1 == WinNum1) && (userNum2 == WinNum2) && (userNum3 == WinNum3)) {
            return "The winning numbers are: " + WinNum1 + " " + WinNum2 + " " + WinNum3 + " " + "Congratulations. You are a Winner!";
        } else {
            return "The winning numbers are: " + WinNum1 + " " + WinNum2 + " " + WinNum3 + " " + "Sorry you don't win this time.";
        }
    }
}