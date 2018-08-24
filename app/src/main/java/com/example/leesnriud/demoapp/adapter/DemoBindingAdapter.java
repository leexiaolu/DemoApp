package com.example.leesnriud.demoapp.adapter;


import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import androidx.databinding.BindingAdapter;

public class DemoBindingAdapter {

    @BindingAdapter({"app:imageUrl","app:placeholder"})
    public static void loadImageFromUrl(ImageView imageView,
                                        String url,
                                        Drawable drawable){
        Glide.with(imageView.getContext())
                .load(url)
                .apply(new RequestOptions().placeholder(drawable))
                .into(imageView);
    }
}
