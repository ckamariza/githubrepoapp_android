package com.githubrepos.application.ui.main;

import android.os.Bundle;

import com.githubrepos.application.R;
import com.githubrepos.application.base.BaseActivity;
import com.githubrepos.application.ui.list.ListFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().add(R.id.screenContainer, new ListFragment()).commit();
    }
}
