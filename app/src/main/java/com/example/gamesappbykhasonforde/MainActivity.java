package com.example.gamesappbykhasonforde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.GnssNavigationMessage;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DiplayPoemMessage(View view){
        Toast.makeText(getApplicationContext(),"You Selected Poem!",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Poem.class);
        startActivity(intent);
    }
    public void DiplayFortuneTellerMessage(View view){
        Toast.makeText(getApplicationContext(),"You Selected Fortune Teller!",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, FortuneTeller.class);
        startActivity(intent);
    }
    public void DiplayLotteryMessage(View view){
        Toast.makeText(getApplicationContext(),"You Selected Lottery!",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Lottery.class);
        startActivity(intent);
    }
    public void DiplayMadlibsMessage(View view){
        Toast.makeText(getApplicationContext(),"You Selected Madlibs!",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Madlibs.class);
        startActivity(intent);
    }
}
