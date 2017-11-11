package com.zq.library.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.zq.library.BR;

/**
 * Created by steven on 2017/11/11 0011.
 */

public class ObservableContact extends BaseObservable {

    private String mName;
    private String mPhone;

    public ObservableContact(String name, String phone) {
        mName = name;
        mPhone = phone;
    }

    @Bindable
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
        notifyPropertyChanged(BR.phone);
    }
}
