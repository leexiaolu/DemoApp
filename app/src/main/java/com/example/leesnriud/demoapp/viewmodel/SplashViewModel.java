package com.example.leesnriud.demoapp.viewmodel;

import android.content.Intent;
import android.view.View;

import com.example.leesnriud.demoapp.MainActivity;
import com.example.leesnriud.demoapp.ui.CustomActivity;
import com.example.leesnriud.demoapp.ui.TwowayActivity;

public class SplashViewModel {

    public void recyclerViewClick(View view) {
        Intent intent = new Intent(view.getContext(),MainActivity.class);
        view.getContext().startActivity(intent);
    }

    public void twowayClick(View view) {
        Intent intent = new Intent(view.getContext(),TwowayActivity.class);
        view.getContext().startActivity(intent);
    }

    public void customClick(View view) {
        view.getContext().startActivity(new Intent(view.getContext(),CustomActivity.class));
    }
}
