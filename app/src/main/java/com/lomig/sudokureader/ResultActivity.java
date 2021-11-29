package com.lomig.sudokureader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ResultActivity extends AppCompatActivity {

    private ImageButton buttonClose;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageView = findViewById(R.id.imageView);

        if(savedInstanceState==null){
            String file = getIntent().getStringExtra("picture");
            try {
                FileInputStream fileInputStream = ResultActivity.this.openFileInput(file);
                Bitmap bitmap = BitmapFactory.decodeStream(fileInputStream);
                imageView.setImageBitmap(bitmap);
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        buttonClose = findViewById(R.id.buttonClose);
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}