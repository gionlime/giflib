package com.yunbo.giflib;

import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * create by jeek
 * 2022/5/16
 * des: gif操作工具类
 **/
public class GifUtils {

    // TODO: 加载网络gif
     public static void loadGifByNetwork(Context context, String url, ImageView imageView){
             Glide.with(context).as(FrameSequenceDrawable.class).load(url).into(imageView);
     }


    // TODO: 加载本地gif图片
    public static void loadGifByResId(Context context, int resId, ImageView imageView){
            Glide.with(context).as(FrameSequenceDrawable .class).load(resId).into(imageView);
    }

}
