package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.common.EventUtil;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
//                EventUtil.open(context,"com.example.home.ShareActivity");

                try {
                    Class clazz = Class.forName("com.example.home.ShareActivity");
                    Intent intent = new Intent(context, clazz);
                    intent.putExtra("test", "test");
                    context.startActivity(intent);
                } catch (ClassNotFoundException e) {
                    Log.e("zhuang", "未集成，无法跳转");
                }

            }
        });

//        binding.tv1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                try {
////                    Class clazz = Class.forName("com.example.home.MainActivity");
////                    Intent intent = new Intent(MainActivity.this, clazz);
////                    startActivity(intent);
////                } catch (Exception e) {
////                    Log.e("0000",e.toString());
////                }
//            }
//        });
//
//        binding.tv2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        binding.tv3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }
}
