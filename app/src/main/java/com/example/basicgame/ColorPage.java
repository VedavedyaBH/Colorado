package com.example.basicgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class ColorPage extends AppCompatActivity {
    int[] Images = {R.drawable.red, R.drawable.green, R.drawable.khaki, R.drawable.pink, R.drawable.orange, R.drawable.blue, R.drawable.brown, R.drawable.purple, R.drawable.yelllow};
    int img;
   int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_page);
        randomImage();
        Button b1 = findViewById(R.id.red);
        Button b2 = findViewById(R.id.green);
        Button b3 = findViewById(R.id.blue);
        Button b4 = findViewById(R.id.yellow);
        Button b5 = findViewById(R.id.pink);
        Button b6 = findViewById(R.id.purple);
        Button b7 = findViewById(R.id.orange);
        Button b8 = findViewById(R.id.brown);
        Button b9 = findViewById(R.id.khaki);

        b1.setOnClickListener(view -> red());
        b2.setOnClickListener(view -> green());
        b3.setOnClickListener(view -> blue());
        b4.setOnClickListener(view -> yellow());
        b5.setOnClickListener(view -> pink());
        b6.setOnClickListener(view -> purple());
        b7.setOnClickListener(view -> orange());
        b8.setOnClickListener(view -> brown());
        b9.setOnClickListener(view -> khaki());
    }

    private void khaki() {
        int khaki = 2;
        if (img == khaki) {
            randomImage();
        }
        else
            result();
    }

    private void brown() {
        int brown = 6;
        if(img == brown) {
            randomImage();
        }
        else
            result();

    }

    private void orange() {
        int orange = 4;
        if(img == orange) {
            randomImage();
        }
        else
            result();

    }

    private void purple() {
        int purple = 7;
        if(purple == img) {
            randomImage();
        }
        else
            result();

    }

    private void pink() {
        int pink = 3;
        if(img == pink) {
            randomImage();
        }
        else
            result();
    }



    private void yellow() {
        int yellow = 8;
        if(img == yellow) {
            randomImage();
        }
        else
            result();


    }

    private void blue() {
        int blue = 5;
        if(img == blue) {
            randomImage();
        }
        else
            result();

    }

    private void green() {
        int green = 1;
        if (img == green) {
            randomImage();
        }
        else
            result();

    }

    private void red() {
        int red = 0;
        if(img == red) {
            randomImage();
        }
        else
            result();

    }

        private void randomImage () {
            TextView textView = findViewById(R.id.score1);
            textView.setText("Score " +score);
            ImageView imageview = findViewById(R.id.imageView1);
            int idx = new Random().nextInt(Images.length);
            imageview.setImageResource(Images[idx]);
            img = idx;
            score++;
        }

    private void result() {
        Intent intent=new Intent(this,result.class);
        startActivity(intent);

    }
}

