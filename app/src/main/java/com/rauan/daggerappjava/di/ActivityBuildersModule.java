package com.rauan.daggerappjava.di;

import com.rauan.daggerappjava.di.auth.AuthViewModelsModule;
import com.rauan.daggerappjava.ui.auth.AuthActivity;
import com.rauan.daggerappjava.ui.auth.AuthViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class
            }
    )
    abstract AuthActivity contributeAuthActivity();


}
