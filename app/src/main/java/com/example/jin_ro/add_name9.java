package com.example.jin_ro;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.jin_ro.R.layout.activity_add_name9;

public class add_name9 extends AppCompatActivity {

    private Bundle savedInstanceState;

    //名前入力画面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(activity_add_name9);
    }
}