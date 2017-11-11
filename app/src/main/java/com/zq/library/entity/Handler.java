package com.zq.library.entity;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.zq.library.R;

/**
 * Created by steven on 2017/11/11 0011.
 */

public class Handler {

    public void onHandlerClick(View view) {

        Toast.makeText(view.getContext(), "onHandlerClick", Toast.LENGTH_SHORT).show();
    }


    public void onCompletedChanged(Task task, boolean completed) {
        if(completed) {
            task.run();
        }
    }

    public String loadString(Context context) {
        return context.getResources().getString(R.string.string_from_context);
    }
}
