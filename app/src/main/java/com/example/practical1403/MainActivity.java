package com.example.practical1403;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = findViewById(R.id.gridView);
        String[] buttonNames = new String[15];
        for (int i = 0; i < 15; i++) {
            buttonNames[i] = "Button " + (i + 1);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.button_item, R.id.button, buttonNames);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String buttonName = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Clicked: " + buttonName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}