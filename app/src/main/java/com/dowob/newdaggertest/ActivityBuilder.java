package com.dowob.newdaggertest;

import android.app.Activity;

import com.dowob.newdaggertest.screen.main.MainActivity;
import com.dowob.newdaggertest.screen.main.MainModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.multibindings.IntoMap;


/**
 * Created by Wei on 2017/10/13.
 */

//@Module
public abstract class ActivityBuilder {
//    @ContributesAndroidInjector(modules = {MainModule.class})
//    abstract MainActivity bindMainActivity();

//    @Binds
////    @IntoMap
////    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainComponent.Builder builder);
}
