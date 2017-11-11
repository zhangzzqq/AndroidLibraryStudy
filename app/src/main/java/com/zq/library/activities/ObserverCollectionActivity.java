package com.zq.library.activities;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

import com.zq.library.R;
import com.zq.library.databinding.ActivityObserverCollectionBinding;


public class ObserverCollectionActivity extends BaseActivity {

    private ActivityObserverCollectionBinding mBinding;

    private ObservableArrayMap<String, String> mUserMap;
    private ObservableArrayList<String> mUserList;

    public static void start(Context context ){
        context.startActivity(new Intent(context,ObserverCollectionActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observer_collection);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_observer_collection);

        initData1();
        initData2();

    }

    private void initData1() {
        mUserMap = new ObservableArrayMap<>();
        mUserMap.put("firstName", "Connor");
        mUserMap.put("lastName", "Lin");
        mUserMap.put("age", "28");
        mBinding.setUser(mUserMap);
    }

    private void initData2() {
        mUserList = new ObservableArrayList<>();
        mUserList.add(mUserMap.valueAt(0));//lin
        mUserList.add(mUserMap.valueAt(1));//28
        mUserList.add(mUserMap.valueAt(2));//Connor

//        mUserList.add("Connor");
//        mUserList.add( "Lin");
//        mUserList.add("28");
        mBinding.setUserList(mUserList);
    }

    public void onClick(View view) {

        mUserMap.put("firstName", "Google");
        mUserMap.put("lastName", "Inc.");
        mUserMap.put("age", "17");

        mUserList.set(0, mUserMap.valueAt(0));
        mUserList.set(1, mUserMap.valueAt(1));
        mUserList.set(2, mUserMap.valueAt(2));

    }

}
