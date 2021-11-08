package com.example.basicgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.play);
        button.setOnClickListener(view -> openactivity2());

    }
    public void openactivity2(){
       Intent intent= new Intent(this,ColorPage.class);
       startActivity(intent);

    }
}