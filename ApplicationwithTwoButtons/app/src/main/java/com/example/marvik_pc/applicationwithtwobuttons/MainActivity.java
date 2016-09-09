package com.example.marvik_pc.applicationwithtwobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG_FOR_DEBUG = MainActivity.class.getSimpleName();

    Button mBtnSecond;
    int mFirstbtnPress;
    int mSecondBtnPress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSecond = (Button) findViewById(R.id.button2);

        mBtnSecond.setOnClickListener(this);

        Log.d(TAG_FOR_DEBUG, "onCreate");
    }

    public void onButtonClicked(View view) {
        if (view.getId() == R.id.button) {
                mFirstbtnPress++;
                Button mFirstBtn = (Button) findViewById(R.id.button);
                mFirstBtn.setText(String.valueOf(mFirstbtnPress));
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button2) {
            mSecondBtnPress++;
            if (mBtnSecond != null) {
                mBtnSecond.setText(String.valueOf(mSecondBtnPress));
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
