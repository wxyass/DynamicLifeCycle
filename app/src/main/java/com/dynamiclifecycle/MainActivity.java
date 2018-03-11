package com.dynamiclifecycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dynamiclifecycle.fragment.ContactFragment;
import com.dynamiclifecycle.fragment.DynamicFragment;
import com.dynamiclifecycle.fragment.MessageFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private FrameLayout frameLayout;
    private TextView tv_contact;
    private TextView tv_dynamic;
    private TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate.....");
        initView();
        // 一开始进入程序,就往容器中替换Fragment
        changeFragment(new MessageFragment(), "messageFragment");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart.....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume.....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause.....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop.....");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy.....");
    }
    /**
     * 初始化控件
     */
    private void initView() {
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        tv_contact = (TextView) findViewById(R.id.tv_contact);
        tv_dynamic = (TextView) findViewById(R.id.tv_dynamic);
        tv_message = (TextView) findViewById(R.id.tv_message);

        tv_contact.setOnClickListener(this);
        tv_message.setOnClickListener(this);
        tv_dynamic.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_contact:
                changeFragment(new ContactFragment(), "contactFragment");
                break;
            case R.id.tv_dynamic:
                changeFragment(new DynamicFragment(), "dynamicFragment");
                break;
            case R.id.tv_message:
                changeFragment(new MessageFragment(), "messageFragment");

                break;

            default:
                break;
        }
    }

    public void changeFragment(Fragment fragment, String tag) {
        // 获取Fragment管理者
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        // 开启事物
        FragmentTransaction beginTransaction = supportFragmentManager
                .beginTransaction();
        // 当前要添加的Fragment需要放的容器位置
        // 要替换的fragment
        // 标记
        beginTransaction.replace(R.id.frameLayout, fragment, tag);
        // 提交事物
        beginTransaction.commit();

    }
}
