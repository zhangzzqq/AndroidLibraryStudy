package com.example;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.databindingstudy.BR;

/**
 * Created by admin on 2017/8/29.
 */

public class User extends BaseObservable {
    private  String firstName;
    private  String lastName;
    private Boolean isRegister;

    public Boolean isRegister() {

        return isRegister;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public Boolean getRegister() {
        return isRegister;

    }

    public void setRegister(Boolean register) {
        isRegister = register;
        notifyPropertyChanged(BR.register);
    }

    public User(String firstName, String lastName, Boolean isRegister) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegister = isRegister;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public String phone() {

        return "13887673461";
    }
}

