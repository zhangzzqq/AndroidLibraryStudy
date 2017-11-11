package com.zq.library.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.zq.library.DemoBinding;
import com.zq.library.R;
import com.zq.library.adapter.ListAdapter;
import com.zq.library.entity.DemoHandler;
import com.zq.library.entity.ObservableContact;


public class DemoActivity extends BaseActivity {

    private DemoBinding mDemoBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDemoBinding = DataBindingUtil.setContentView(this, R.layout.activity_demo);
        ObservableContact contact = new ObservableContact("", "");
        mDemoBinding.setContact(contact);

        initViews();
    }

    private void initViews() {
        mDemoBinding.listView.setEmptyView(mDemoBinding.emptyView);

        ListAdapter listAdapter = new ListAdapter(this);
        mDemoBinding.listView.setAdapter(listAdapter);

        DemoHandler viewHandler = new DemoHandler(this, mDemoBinding, listAdapter);
        mDemoBinding.setHandler(viewHandler);
    }
}
