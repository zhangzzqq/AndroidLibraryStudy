package com.zq.library.activities;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.zq.library.R;
import com.zq.library.databinding.ActivityObserverBinding;
import com.zq.library.entity.ObservableContact;


public class ObserverActivity extends BaseActivity {

    public static void start(Context context ){
        context.startActivity(new Intent(context,ObserverActivity.class));
    }

    private ActivityObserverBinding mBinding;
    private ObservableContact mObservableContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_observer);

        mObservableContact = new ObservableContact("police","110");
        mBinding.setContact(mObservableContact);
    }

    public void onClick(View view) {
        mObservableContact.setName("ConnorLin");
        mObservableContact.setPhone("12345678901");
    }


}
