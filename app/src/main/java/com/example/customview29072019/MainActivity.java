package com.example.customview29072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DefaultSolarItem defaultSolarItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defaultSolarItem = findViewById(R.id.group1);
        Log.d("BBB",defaultSolarItem.isFocusable() + "");
        defaultSolarItem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    defaultSolarItem.setBackgroud(getResources().getColor(R.color.colorYellow));
                }
                Log.d("BBB",hasFocus + "");
            }
        });
    }
}
