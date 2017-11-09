package com.example;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.databindingstudy.BR;

/**
 * Created by steven on 2017/9/12.
 */

public class PatientInwardIcuEntity extends BaseObservable {

    private String patientName;

    @Bindable
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
        notifyPropertyChanged(BR.patientName);
    }


}
