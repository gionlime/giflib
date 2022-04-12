package com.example.giflibdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
/**
 * create by jeek
 * 2022/4/7
 * des:
 **/
public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv);
        //gif网  https://www.vcg.com/sets/516794080
        String gif = "https://alifei05.cfp.cn/creative/vcg/nowater800/new/VCG211291463845.gif";
        // TODO: 加载网络gif
        //Glide.with(this).as(FrameSequenceDrawable.class).load(gif).into(imageView);
        // TODO: 加载本地gif图片
        Glide.with(this).as(FrameSequenceDrawable.class).load(R.raw.drink_to).into(imageView);
    }
}
