package com.example.prg_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    ToggleButton toggle;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggle=findViewById(R.id.toggle);
        i1=findViewById(R.id.i1);
        i1.setImageDrawable(getResources().getDrawable(R.drawable.bluetooth_off));
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status = "Bluetooth : " + toggle.getText();
                Toast.makeText(getApplicationContext(), status,
                        Toast.LENGTH_SHORT).show();
                if(toggle.isChecked()){

                    i1.setImageDrawable(getResources().getDrawable(R.drawable.bluetooth_on));
                }else{
                    i1.setImageDrawable(getResources().getDrawable(R.drawable.bluetooth_off));
                }
            }
        });
    }
}