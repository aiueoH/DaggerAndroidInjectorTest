package com.dowob.newdaggertest.screen.main;

import com.dowob.newdaggertest.model.AppModel;
import com.dowob.newdaggertest.screen.main.login.LoginContract;
import com.dowob.newdaggertest.screen.main.login.LoginFragment;
import com.dowob.newdaggertest.screen.main.login.LoginPresenter;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Wei on 2017/10/13.
 */

@Module
public abstract class MainModule {
    @ContributesAndroidInjector
    abstract LoginFragment bindLoginFragment();


    @Binds
    public abstract MainContract.Presenter provideMainPresenter(MainPresenter mainPresenter);

    @Binds
    public abstract LoginContract.Presenter provideLoginPresenter(LoginPresenter loginPresenter);
}
