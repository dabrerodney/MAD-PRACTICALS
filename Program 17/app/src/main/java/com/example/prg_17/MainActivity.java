package com.example.prg_17;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Call(View v)
    {
        EditText e = (EditText)findViewById(R.id.ed1);
        Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show();
        Uri u = Uri.parse("tel:" + e.getText().toString());
        Intent i = new Intent(Intent.ACTION_DIAL, u);
        try
        {
            startActivity(i);
        }
        catch (SecurityException s)
        {
            Toast.makeText(this, "An error occurred", Toast.LENGTH_LONG).show();
        }
    }
}