package com.example;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.example.databindingstudy.R;

/**
 * Created by steven on 2017/8/31.
 */

public class Task  extends Activity{

    private Button text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.click_activity);

        text = (Button) findViewById(R.id.btn_click);
        text.setText("Task");

    }

    public static void startActivity(Context context){
        Intent intent = new Intent(context,Task.class);
        context.startActivity(intent);

    }
}
