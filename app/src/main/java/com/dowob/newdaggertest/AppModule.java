package com.dowob.newdaggertest;

import com.dowob.newdaggertest.model.AppModel;
import com.dowob.newdaggertest.screen.main.MainActivity;
import com.dowob.newdaggertest.screen.main.MainModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;


/**
 * Created by Wei on 2017/10/13.
 */

@Module
public abstract class AppModule {
    private MyApplication myApplication;

    @ContributesAndroidInjector(modules = {MainModule.class})
    abstract MainActivity bindMainActivity();

    @Provides
    @Singleton
    static AppModel provideAppModel() {
        return new AppModel();
    }

//    public AppModule(MyApplication myApplication) {
//        this.myApplication = myApplication;
//    }
}
