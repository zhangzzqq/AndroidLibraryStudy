package com.zq.library.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import com.zq.library.R;
import com.zq.library.adapter.RecyclerAdapter;
import com.zq.library.databinding.ActivityMainBinding;

/**
 * Created by steven on 2017/11/11 0011.
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_databind);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.recyclerView.setHasFixedSize(true);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.recyclerView.setItemAnimator(new DefaultItemAnimator());

        RecyclerAdapter mRecyclerAdapter = new RecyclerAdapter();
        mBinding.recyclerView.setAdapter(mRecyclerAdapter);


    }
}

