package com.example.leesnriud.demoapp.viewmodel;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

import com.example.leesnriud.demoapp.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import timber.log.Timber;

public class TwowayViewModel extends BaseObservable {

    private String name;
    private Boolean check = false;

    public TwowayViewModel() {
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
        notifyPropertyChanged(BR.check);
    }

    public void login() {
        Timber.e("name is === ${name} " + name);
        Timber.e("check is === " + check);
    }

    @BindingAdapter({"app:checkStauts"})
    public static void checkStauts(EditText editText,Boolean status) {
        if (status) {
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
