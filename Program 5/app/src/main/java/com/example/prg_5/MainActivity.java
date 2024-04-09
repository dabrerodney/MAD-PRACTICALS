package com.example.prg_5;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    private Button buttonShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);
        checkBox5 = findViewById(R.id.checkbox5);
        buttonShow = findViewById(R.id.buttonShow);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSelectedCheckboxes();
            }
        });
    }

    private void showSelectedCheckboxes() {
        StringBuilder selectedCheckboxes = new StringBuilder("Selected: ");
        if (checkBox1.isChecked()) selectedCheckboxes.append("\nCheckbox 1");
        if (checkBox2.isChecked()) selectedCheckboxes.append("\nCheckbox 2");
        if (checkBox3.isChecked()) selectedCheckboxes.append("\nCheckbox 3");
        if (checkBox4.isChecked()) selectedCheckboxes.append("\nCheckbox 4");
        if (checkBox5.isChecked()) selectedCheckboxes.append("\nCheckbox 5");

        Toast.makeText(MainActivity.this, selectedCheckboxes.toString(), Toast.LENGTH_LONG).show();
    }
}
