package com.example.prg_18;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result= findViewById(R.id.result);
        Intent i2= getIntent();
        int num=Integer.parseInt(i2.getStringExtra("number"));
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        result.append(fact+"");
    }
}