package com.example.giflibdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "gifcpp";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);

        String gif = "https://img95.699pic.com/photo/40102/6852.gif_wh300.gif";
        Glide.with(this).as(FrameSequenceDrawable.class).load(gif).into(imageView);
    }
}
