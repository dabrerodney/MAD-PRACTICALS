package com.example.prg_16;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText txtLink;
    Button btnOpenLink;
    String defaultLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defaultLink = "http://";
        txtLink = (EditText) findViewById(R.id.ed1);
        btnOpenLink = (Button) findViewById(R.id.b1);
        btnOpenLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = txtLink.getText().toString();
                if(!TextUtils.isEmpty(link)){
                    Uri uri = Uri.parse(defaultLink+link);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else{
                    txtLink.setError("Enter URL");
                }
            }
        });
    }
}