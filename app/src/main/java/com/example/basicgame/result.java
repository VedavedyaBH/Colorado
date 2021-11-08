package com.example.basicgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Button button = findViewById(R.id.gohome);
        button.setOnClickListener(view -> home());

    }
    private void gameover() {
        TextView textView = findViewById(R.id.textView2);
        textView.setText("Game over");
    }
    private void home(){
    Intent intent= new Intent(this,MainActivity.class);
    startActivity(intent);
}
}