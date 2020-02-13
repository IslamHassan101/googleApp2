package com.example.googleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int mycounter;
    TextView tc_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tc_value =findViewById(R.id.et_zero);
        mycounter=0;
        Intent intent=getIntent();
        String message = intent.getStringExtra(AboutScreen.MESSAGE_NAME_ABOUT_US);
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    public void bt_abutUs(View view) {
        Intent intent= new Intent(this,AboutScreen.class);
        startActivity(intent);



    }
    public void bt_minus(View view) {
        mycounter--;
        tc_value.setText(String.valueOf(mycounter));
    }

    public void bt_plus(View view) {
        mycounter++;
        String x =String.valueOf(mycounter);
        tc_value.setText(x);
    }
}
