package com.example.valuepass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle b=getIntent().getExtras();
        EditText e2=(EditText) findViewById(R.id.txt_2);
        e2.setText(b.getString("name"));
    }
    public void onHide(View v){
        finish();
    }
}