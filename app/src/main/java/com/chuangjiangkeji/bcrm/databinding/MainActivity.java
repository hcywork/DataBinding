 package com.chuangjiangkeji.bcrm.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chuangjiangkeji.bcrm.databinding.databinding.ActivityMainBinding;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setUser(new User("sdjfhs","test"));
    }
}
