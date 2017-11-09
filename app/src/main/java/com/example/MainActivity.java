package com.example;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.databindingstudy.R;
import com.example.databindingstudy.databinding.MainBinding;

public class MainActivity extends AppCompatActivity {

    private MainBinding binding;
    private User user;
    private Sample sample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("li", "lier",true);
        binding.setUser(user); //赋值进去

        // 这种方式
        // android:onClick="@{handlers::onClickFriend}"
        binding.setHandlers(new MyHandlers()); //onClickFriend
        binding.setClick(this); //当前类中的btnClick

        /*
            这种方式
            android:onClick="@{() -> presenter.onSaveClick()}"
            必须用public来修饰，这样才能找到
         */

        binding.setPresenter(new Presenter());
        binding.setBtn(this);
        binding.setPresenter2(new com.example.same.Presenter());

        initCheckBox();

        initData();

    }


    private void initCheckBox() {
        binding.setCheckBox(binding.checkBox);

       if( binding.checkBox.isChecked()){
           checked(true);
       }else {
           checked(false);
       }

    }

    public Boolean checked(Boolean a){
        Toast.makeText(this,"b=="+a.toString(),Toast.LENGTH_LONG).show();
        return a;
    }


    public void btnClick(View view) {
        ClickActivity.startActivity(MainActivity.this);
    }

    private void onClickFriend() {
        Toast.makeText(MainActivity.this, "onClickFriend", Toast.LENGTH_LONG).show();
    }

    public void onMainClick(int a) {
        Toast.makeText(this, "传过来的值是：" + a, Toast.LENGTH_LONG).show();
        user.setFirstName("zhang");
        user.setLastName("san");
        user.setRegister(false);

        /*
            一个属性用监听，它的值变化，自己在布局中改变，其他的属性也被通知了（改变）。
         */
        sample.setAge("11");
        sample.setGender("男");
        sample.setName("xiaoxiao");

    }


    private void initData() {

        sample = new Sample("10 ","女  ","  xiaoli  ");
        binding.setMessage(sample);



    }


}
