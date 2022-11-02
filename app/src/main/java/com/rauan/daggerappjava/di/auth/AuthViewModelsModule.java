package com.rauan.daggerappjava.di.auth;

import androidx.lifecycle.ViewModel;

import com.rauan.daggerappjava.di.ViewModelKey;
import com.rauan.daggerappjava.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindViewModel(AuthViewModel viewModel);
}
