package com.githubrepos.application.ui.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.githubrepos.application.ui.detail.DetailsFragment;
import com.githubrepos.application.ui.list.ListFragment;

@Module
public abstract class MainFragmentBindingModule {

    @ContributesAndroidInjector
    abstract ListFragment provideListFragment();

    @ContributesAndroidInjector
    abstract DetailsFragment provideDetailsFragment();
}
