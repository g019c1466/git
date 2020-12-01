package com.example.jin_ro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import static com.example.jin_ro.R.layout.activity_add_name6;

public class add_name6 extends AppCompatActivity {


    private Bundle savedInstanceState;

    //名前入力画面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(activity_add_name6);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //変数 = (キャスト)findViewById(使いたいウィジェットのid)
            EditText Name1 = (EditText) findViewById(R.id.editTextTextPersonName);
            EditText Name2 = (EditText) findViewById(R.id.editTextTextPersonName2);
            EditText Name3 = (EditText) findViewById(R.id.editTextTextPersonName3);
            EditText Name4 = (EditText) findViewById(R.id.editTextTextPersonName4);
            EditText Name5 = (EditText) findViewById(R.id.editTextTextPersonName5);
            EditText Name6 = (EditText) findViewById(R.id.editTextTextPersonName6);
                Name1.getText().toString();
                Name2.getText().toString();
                Name3.getText().toString();
                Name4.getText().toString();
                Name5.getText().toString();
                Name6.getText().toString();
        }
        }
    }
}