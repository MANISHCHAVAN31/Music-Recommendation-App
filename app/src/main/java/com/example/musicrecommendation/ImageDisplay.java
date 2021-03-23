package com.example.musicrecommendation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageDisplay extends AppCompatActivity {

     View imageDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        imageDisplay = findViewById(R.id.imageDisplay);

       Intent intent = getIntent();
       Bitmap bitmap = (Bitmap) intent.getParcelableExtra("capturedImage");

        ((ImageView)imageDisplay).setImageBitmap(bitmap);





    }
}