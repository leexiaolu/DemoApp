package com.example.leesnriud.demoapp.viewmodel;

import com.example.leesnriud.demoapp.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import timber.log.Timber;

public class TwowayViewModel extends BaseObservable {

    private String name;

    public TwowayViewModel(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void login() {
        Timber.e("name is === ${name} " + name);
    }

}
