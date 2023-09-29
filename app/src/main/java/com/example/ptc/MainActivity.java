package com.example.ptc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private Button startButton;
    private Button stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
    }

    public void startChronometer(View view) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
        startButton.setEnabled(false);
        stopButton.setEnabled(true);
    }

    public void stopChronometer(View view) {
        chronometer.stop();
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
    }
}
