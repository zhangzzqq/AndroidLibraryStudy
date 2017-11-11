package com.zq.library.activities;

import android.app.ListActivity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.zq.library.R;
import com.zq.library.databinding.ActivityDatabindBinding;
import com.zq.library.databinding.ActivityMainBinding;
import com.zq.library.entity.DemoHandler;
import com.zq.library.entity.Handler;
import com.zq.library.entity.Task;
import com.zq.library.entity.User;
import com.zq.library.utils.JumpActivity;

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
 * <p>
 * 3 直接在布局总写入
 * android:onClick="tvClick"
 * 这种方式在本类中的方法中需要加入 （View view ）
 * 这种方式比较简单，不需要再加入其他的代码
 * <p>
 * <p>
 * 监听调用会比较灵活
 * <p>
 * 关于xml中的参数 两种选择：要么不写，要么就要写全。
 * <Button
 * android:layout_width="match_parent"
 * android:layout_height="wrap_content"
 * android:onClick="@{() -> handler.onTaskClick(task)}" />
 * 或
 * <Button
 * android:layout_width="match_parent"
 * android:layout_height="wrap_content"
 * android:onClick="@{(view) -> handler.onTaskClick(task)}"/>
 * <p>
 * android中%1$s、%1$d的用法
 * http://blog.csdn.net/mattdong0106/article/details/51077708
 * <p>
 * purse用法
 * http://www.jianshu.com/p/bf8c4b4c8049
 */

public class DataBindActivity extends BaseActivity {


    private ActivityDatabindBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_databind);


        initData();

        initClick();
    }


    private void initData() {

        User user = new User("li", "18", true);
        binding.setHandlers(this); //DataBindActivity
        binding.setHandler(new Handler());//handler
        binding.setUser(user);
        binding.setCheckBox(binding.checkBox);
        binding.setTask(new Task()); //task


        String strPurse = getResources().getQuantityString(R.plurals.buy_kindle, 1);
        binding.tvPurse.setText(strPurse);


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

        Toast.makeText(DataBindActivity.this, "tvText被点击", Toast.LENGTH_SHORT).show();
    }

    public void onMainClick(boolean a) {

        Toast.makeText(this, "传过来的值是：" + a, Toast.LENGTH_LONG).show();
    }


    public void showTask(View view, Task task) {

//        Toast.makeText(view.getContext(), "showTask", Toast.LENGTH_LONG).show();
        task.showTask(view.getContext());
        task.run();

    }

    public void showTask2(View view, Task task) {

        Toast.makeText(this, "showTask", Toast.LENGTH_LONG).show();
        task.showTask(view.getContext());
//        task.run();

    }

    public void startObserverActivity(View view) {

        ObserverActivity.start(DataBindActivity.this);
    }

    public void ObserverCollectionActivity(View view) {

        ObserverCollectionActivity.start(DataBindActivity.this);
    }

    public void jumpDemoActivity(View view) {

        JumpActivity.start(view.getContext(), DemoActivity.class);

    }


}
