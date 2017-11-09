package com.example;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.databindingstudy.R;
import com.example.databindingstudy.databinding.ClickActBinding;

/**
 * Created by admin on 2017/8/29.
 */

public class ClickActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ClickActBinding binding = DataBindingUtil.setContentView(this,R.layout.click_activity);
        binding.setHandler(this);

    }

    public static void startActivity(Context context){
        Intent intent = new Intent(context,ClickActivity.class);
        context.startActivity(intent);
    }

        public void on_click_activity(View view) {

            Toast.makeText(getApplicationContext(), "onClickActivity", Toast.LENGTH_LONG).show();
        }



}
