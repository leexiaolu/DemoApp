package com.example.leesnriud.demoapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.leesnriud.demoapp.R;
import com.example.leesnriud.demoapp.databinding.ActivityCustomBinding;

public class CustomActivity extends AppCompatActivity {

    ActivityCustomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_custom);
    }
}
