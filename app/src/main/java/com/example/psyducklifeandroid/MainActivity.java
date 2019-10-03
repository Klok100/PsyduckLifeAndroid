package com.example.psyducklifeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View v){

    }

    public void shareInfoToRun(View v) {

        Intent intent = new Intent(this, RunningActivity.class);

        startActivity(intent);

    }

    public void shareInfoToSwim(View v) {

        Intent intent = new Intent(this, SwimmingActivity.class);

        startActivity(intent);

    }

    public void shareInfoToFly(View v) {

        Intent intent = new Intent(this, FlyingActivity.class);

        startActivity(intent);

    }

}
