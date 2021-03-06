package com.yunbo.giflib;

import android.content.Context;
import android.support.rastermill.FrameSequenceDrawable;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import java.io.InputStream;
/**
 * create by jeek
 * 2022/4/7
 * des:
 **/
@GlideModule
public class GifGlideModule extends AppGlideModule {

    @Override
    public void registerComponents(@NonNull Context context,
                                   @NonNull Glide glide, @NonNull Registry registry) {
        super.registerComponents(context, glide, registry);
        registry.append(Registry.BUCKET_GIF, InputStream.class,
                FrameSequenceDrawable.class, new GifDecoder(glide.getBitmapPool()));
    }
}
