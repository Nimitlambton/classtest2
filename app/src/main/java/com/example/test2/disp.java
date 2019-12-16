package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class disp extends AppCompatActivity {


    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp);

        image = findViewById(R.id.imageView2);
       String name = countiesActivity.name;

        image.setImageResource(R.drawable.canada);


        int imgId = getResources().getIdentifier(name,"drawable",getPackageName());
        image.setImageResource(imgId);


    }
}
