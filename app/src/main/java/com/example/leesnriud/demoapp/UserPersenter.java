package com.example.leesnriud.demoapp;

import android.view.View;
import android.widget.Toast;

public class UserPersenter {

    public void onClick(View view,User user) {
        Toast.makeText(view.getContext(),"user: " + user.name + "子控件被点击",Toast.LENGTH_SHORT).show();
    }
}
