package com.example.googleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutScreen extends AppCompatActivity {
    static final String MESSAGE_NAME_ABOUT_US ="message from about us activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_screen);
    }

    public void gotoCounter(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(MESSAGE_NAME_ABOUT_US,getString(R.string.hello_from_about_us_activity));
        startActivity(intent);
    }
}
