package com.example.leesnriud.demoapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.leesnriud.demoapp.R;
import com.example.leesnriud.demoapp.databinding.ActivityTwowayBinding;
import com.example.leesnriud.demoapp.viewmodel.TwowayViewModel;

/**
 * dataBinding 双向绑定
 */
public class TwowayActivity extends AppCompatActivity {

    ActivityTwowayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_twoway);
        binding.setModel(new TwowayViewModel());
    }
}
