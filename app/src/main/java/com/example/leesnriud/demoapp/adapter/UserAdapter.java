package com.example.leesnriud.demoapp.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.leesnriud.demoapp.BR;
import com.example.leesnriud.demoapp.R;
import com.example.leesnriud.demoapp.UserPersenter;
import com.example.leesnriud.demoapp.model.User;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public class UserAdapter extends BaseQuickAdapter<User,UserAdapter.UserViewHolder>{

    private UserPersenter persenter;

    public UserAdapter(int layoutResId, @Nullable List<User> data) {
        super(layoutResId, data);
        persenter = new UserPersenter();
    }

    @Override
    protected void convert(UserViewHolder helper, User item) {
        ViewDataBinding binding = helper.getBinding();
        binding.setVariable(BR.user,item);
        binding.setVariable(BR.persenter,persenter);
        binding.executePendingBindings();
    }

    @Override
    protected View getItemView(int layoutResId, ViewGroup parent) {
        ViewDataBinding binding = DataBindingUtil.inflate(mLayoutInflater, layoutResId, parent, false);
        if (binding == null) {
            return super.getItemView(layoutResId, parent);
        }
        View view = binding.getRoot();
        view.setTag(R.id.BaseQuickAdapter_databinding_support, binding);
        return view;
    }

    public static class UserViewHolder extends BaseViewHolder {

        public UserViewHolder(View view) {
            super(view);
        }

        public ViewDataBinding getBinding() {
            return (ViewDataBinding) itemView.getTag(R.id.BaseQuickAdapter_databinding_support);
        }
    }
}
