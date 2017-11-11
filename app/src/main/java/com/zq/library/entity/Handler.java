package com.zq.library.entity;

import android.view.View;
import android.widget.Toast;

/**
 * Created by steven on 2017/11/11 0011.
 */

public class Handler {

    public void onHandlerClick(View view) {

        Toast.makeText(view.getContext(), "onHandlerClick", Toast.LENGTH_SHORT).show();
    }



}
