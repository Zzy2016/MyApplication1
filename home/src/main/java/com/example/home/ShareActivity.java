package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        String test = getIntent().getStringExtra("test");
        TextView tv = (TextView) findViewById(R.id.tv);

        tv.setText("分享----"+test);
    }
}
