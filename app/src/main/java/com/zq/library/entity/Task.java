package com.zq.library.entity;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * ClassName: Task
 * Description:
 * Author: connorlin
 * Date: Created on 2016-7-1.
 */
public class Task implements Runnable {

    @Override
    public void run() {
        Log.i(Task.class.getName(), "Task run++");
    }

    public void showTask(Context context){
        Toast.makeText(context,"showTask",Toast.LENGTH_SHORT).show();
    }
}
