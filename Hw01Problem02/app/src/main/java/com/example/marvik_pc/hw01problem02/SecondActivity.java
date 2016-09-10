package com.example.marvik_pc.hw01problem02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_layout);
        Intent intent = this.getIntent();
        String componentInfo = intent.getStringExtra("componentInfo");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(componentInfo);
    }
}
