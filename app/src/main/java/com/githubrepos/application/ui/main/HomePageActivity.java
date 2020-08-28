package com.githubrepos.application.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.text.Html;
import android.view.View;

import com.githubrepos.application.R;
import com.githubrepos.application.base.BaseActivity;
import com.githubrepos.application.ui.list.ListFragment;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout resource
        setContentView(R.layout.activity_homepage);

        ActionBar bar = getSupportActionBar();
        bar.setTitle("GITHUB Repos APP");
        // Enable the up button
        bar.setDisplayHomeAsUpEnabled(false);
        bar.setHomeButtonEnabled(false);

        AppCompatButton enterBtn = findViewById(R.id.enter_btn);
        enterBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomePageActivity.this,MainActivity.class);
            startActivity(intent);
        });

    }
}
