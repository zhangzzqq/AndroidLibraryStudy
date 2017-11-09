package com.example;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.databindingstudy.BR;

/**
 * Created by steven on 2017/9/12.
 */

public class Sample extends BaseObservable {

    private String gender;
    private String name;
    private String age;

    public Sample(String gender, String name, String age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }
    @Bindable
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(BR.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
