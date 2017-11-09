package com.example;

import android.app.Activity;
import android.content.Loader;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.databindingstudy.R;

/**
 * Created by steven on 2017/8/31.
 */

public class MyHandlers  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
    }

    public void onClickFriend(View view) {

        Toast.makeText(view.getContext(),"MyHandlers",Toast.LENGTH_LONG).show();
        Log.d("MyHandlers","click..");

    }
}
