package com.example.prg_10;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    GridView gridView;
    static final String[] numbers = new String[] {
            "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "10","11","12","13","14","15"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int
                    position,long id) {
                Toast.makeText(getApplicationContext(),((TextView)
                        view).getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}