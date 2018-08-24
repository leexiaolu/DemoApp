package com.example.leesnriud.demoapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.leesnriud.demoapp.R;
import com.example.leesnriud.demoapp.databinding.ActivitySplashBinding;
import com.example.leesnriud.demoapp.viewmodel.SplashViewModel;

public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash);
        binding.setModel(new SplashViewModel());
        // 
    }
}
