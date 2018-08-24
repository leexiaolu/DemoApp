package com.example.leesnriud.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import timber.log.Timber;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.leesnriud.demoapp.adapter.UserAdapter;
import com.example.leesnriud.demoapp.databinding.ActivityMainBinding;
import com.example.leesnriud.demoapp.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * dataBinding + recyclerView
 */
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    UserAdapter adapter;
    ArrayList<User> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        list = new ArrayList<>();
        adapter = new UserAdapter(R.layout.item_user,getData());
        activityMainBinding.recycler.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recycler.setAdapter(adapter);
        // 下拉刷新
        activityMainBinding.swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                list.clear();
                activityMainBinding.swipe.setRefreshing(false);
                updateData();
                adapter.notifyDataSetChanged();
            }
        });

        // 上拉加載
        adapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                addData();
                adapter.notifyDataSetChanged();
                adapter.loadMoreComplete();
            }
        },activityMainBinding.recycler);

        // 点击事件
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this,"item 点击事件",Toast.LENGTH_LONG).show();
                Timber.e("item被点击了");
            }
        });

        // 长按事件
        adapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this,"item 长按  事件",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    private List<User> getData() {
        for (int i = 0; i < 30; i ++) {
            User user = new User("lee " + i);
            list.add(user);
        }
        return list;
    }

    private List<User> addData() {
        for (int i = 0; i < 10; i ++) {
            User user = new User("add lee " + i);
            list.add(user);
        }
        return list;
    }

    private List<User> updateData() {
        for (int i = 0; i < 20; i ++) {
            User user = new User("update " + i);
            list.add(user);
        }
        return list;
    }
}
