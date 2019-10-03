package com.githubrepos.application.di.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.githubrepos.application.ui.main.MainActivity;
import com.githubrepos.application.ui.main.MainFragmentBindingModule;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();
}
