package com.dycode.edu.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = findViewById(R.id.textView);

        // get Data
        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}