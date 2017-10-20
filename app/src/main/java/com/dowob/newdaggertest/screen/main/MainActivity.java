package com.dowob.newdaggertest.screen.main;

import android.os.Bundle;

import com.dowob.newdaggertest.R;
import com.dowob.newdaggertest.mvp.BaseActivity;
import com.dowob.newdaggertest.screen.main.login.LoginFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends BaseActivity {

    @Inject
    MainPresenter mainPresenter;

//    @Inject
    LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginFragment = new LoginFragment();

//        String msg = String.valueOf(mainPresenter.getTimestamp());
//        new AlertDialog.Builder(this)
//                .setMessage(msg)
//                .show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        replace();
    }

    private void replace() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, loginFragment)
                .commit();
    }
}
