package com.example.giflibdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "mygif";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);

        String gif = "https://n.sinaimg.cn/spider2019124/16/w500h316/20191204/aa9f-ikhvemx7549454.gif";
        Glide.with(this).as(FrameSequenceDrawable.class).load(gif).into(imageView);
    }
}
