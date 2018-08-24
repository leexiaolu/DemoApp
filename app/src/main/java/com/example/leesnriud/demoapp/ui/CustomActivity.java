package com.example.leesnriud.demoapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.leesnriud.demoapp.R;
import com.example.leesnriud.demoapp.databinding.ActivityCustomBinding;
import com.example.leesnriud.demoapp.model.Image;

public class CustomActivity extends AppCompatActivity {

    ActivityCustomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_custom);
        //
        Image image = new Image();
        image.setImageUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1535093005766&di=4b0493f6f637d688b22a63a353e27f89&imgtype=0&src=http%3A%2F%2Fimg0.pconline.com.cn%2Fpconline%2F1705%2F10%2F9209168_989_thumb.jpg");
        binding.setImage(image);

    }
}
