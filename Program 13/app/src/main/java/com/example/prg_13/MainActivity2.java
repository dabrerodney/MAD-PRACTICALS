package com.example.prg_13;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
public class MainActivity2 extends AppCompatActivity {
    TextView textview1;
    TimePicker timepicker;
    Button changetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview1 = (TextView) findViewById(R.id.textView1);
        timepicker = (TimePicker) findViewById(R.id.timePicker);
        timepicker.setIs24HourView(true);
        changetime = (Button) findViewById(R.id.button1);
        textview1.setText(getCurrentTime());
        changetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime() {
        String currentTime = "Current Time: " + timepicker.getCurrentHour() + ":" + timepicker.getCurrentMinute();
        return currentTime;
    }
}