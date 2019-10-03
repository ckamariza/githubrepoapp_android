package com.githubrepos.application.base;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import com.githubrepos.application.di.component.ApplicationComponent;
import com.githubrepos.application.di.component.DaggerApplicationComponent;

public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);

        return component;
    }
}
