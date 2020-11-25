package com.example.jin_ro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.jin_ro.R.layout.activity_add_name8;

public class add_name8 extends AppCompatActivity {

    private Bundle savedInstanceState;

    //名前入力画面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(activity_add_name8);
    }
}
