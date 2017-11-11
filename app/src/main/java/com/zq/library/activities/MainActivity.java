package com.zq.library.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.zq.library.R;
import com.zq.library.databinding.ActivityMainBinding;
import com.zq.library.entity.Handler;
import com.zq.library.entity.User;

/**
 * 方法调用
 * 监听绑定
 * 二者主要区别在于方法调用在编译时处理，而监听绑定于事件发生时处理。
 * <p>
 * 1方法调用：
 * 这主意这种方式  binding.setHandler(new Handler());
 * android:onClick="@{handler::onHandlerClick}"
 * 在布局中这样写的话只能传new Handler()对象过去
 * <p>
 * 2监听调用 ：
 * android:onClick="@{()-> handlers.onMainClick(false)}"
 *
 * 3 直接在布局总写入
 *  android:onClick="tvClick"
 *  这种方式在本类中的方法中需要加入 （View view ）
 *  这种方式比较简单，不需要再加入其他的代码
 *
 * 监听调用会比较灵活
 *
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandlers(this);
        binding.setHandler(new Handler());

        initData();

        initClick();
    }


    private void initData() {

        User user = new User("li", "18", true);
        binding.setUser(user);
        binding.setCheckBox(binding.checkBox);

    }

    private void initClick() {

        binding.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    setCkecked(isChecked);
            }
        });
    }

    private void setCkecked(boolean isChecked) {

        binding.checkBox.setChecked(isChecked);

    }


    public void tvClick(View view) {
        Toast.makeText(MainActivity.this, "tvText被点击", Toast.LENGTH_SHORT).show();
    }

    public void onMainClick(boolean a) {
        Toast.makeText(this, "传过来的值是：" + a, Toast.LENGTH_LONG).show();
    }



}
