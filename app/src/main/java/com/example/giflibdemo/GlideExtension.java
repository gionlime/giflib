package com.example.giflibdemo;

import android.support.rastermill.FrameSequenceDrawable;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.annotation.GlideType;
import com.bumptech.glide.request.RequestOptions;
/**
 * create by jeek
 * 2022/4/7
 * des:
 **/
@com.bumptech.glide.annotation.GlideExtension
public class GlideExtension {

    private GlideExtension() {

    }

    final static RequestOptions DECODE_TYPE = RequestOptions
            .decodeTypeOf(FrameSequenceDrawable.class)
            .lock();

    @GlideType(FrameSequenceDrawable.class)
    public static void asGif2(RequestBuilder<FrameSequenceDrawable> requestBuilder) {
        requestBuilder.apply(DECODE_TYPE);
    }
}
