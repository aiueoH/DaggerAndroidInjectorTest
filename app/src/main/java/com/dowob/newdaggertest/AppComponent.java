package com.dowob.newdaggertest;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Wei on 2017/10/13.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
})

public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(MyApplication myApplication);
        AppComponent build();
    }

    void inject(MyApplication myApplication);
}
