package com.example.marvik_pc.hw01problem02;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    Button mFirstBtn;
    Button mSecondBtn;
    Button mThirdBtn;
    TextView mTextView;
    int lastElementId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstBtn  = (Button) findViewById(R.id.button);
        mFirstBtn.setOnClickListener(this);

        mSecondBtn = (Button) findViewById(R.id.button2);
        mSecondBtn.setOnClickListener(this);

        mThirdBtn = (Button) findViewById(R.id.button3);
        mThirdBtn.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            if (mTextView.getText().equals(mFirstBtn.getText())) {
                return;
            }
            if (mTextView.getText().equals(String.valueOf(mFirstBtn.getId()))) {
                mTextView.setText(mFirstBtn.getText());
            } else {
                mTextView.setText(String.valueOf(R.id.button));
            }
            lastElementId = mFirstBtn.getId();

        } else if (view.getId() == R.id.button2) {
            if (mTextView.getText().equals(mSecondBtn.getText())) {
                return;
            }
            if (mTextView.getText().equals(String.valueOf(mSecondBtn.getId()))) {
                mTextView.setText(mSecondBtn.getText());
            } else {
                mTextView.setText(String.valueOf(R.id.button2));
            }
            lastElementId = mSecondBtn.getId();

        } else if (view.getId() == R.id.button3) {
            if (mTextView.getText().equals(mThirdBtn.getText())) {
                return;
            }
            if (mTextView.getText().equals(String.valueOf(mThirdBtn.getId()))) {
                mTextView.setText(mThirdBtn.getText());
            } else {
                mTextView.setText(String.valueOf(R.id.button3));
            }
            lastElementId = mThirdBtn.getId();

        } else if (view.getId() == R.id.textView){
            if (lastElementId == -1) {
                return;
            }
            int componentId = lastElementId;
            String componentName = ((Button) findViewById(componentId)).getText().toString();
            String componentInfo = String.format("ID: %s%n Name: %s", componentId, componentName);
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            intent.putExtra("componentInfo", componentInfo);
            startActivity(intent);
        }

    }
}
