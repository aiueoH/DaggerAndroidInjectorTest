package com.dowob.newdaggertest.screen.main.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dowob.newdaggertest.R;
import com.dowob.newdaggertest.mvp.BaseFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

/**
 * Created by Wei on 2017/10/19.
 */

public class LoginFragment
        extends BaseFragment<LoginContract.Presenter>
        implements LoginContract.View {

    @Inject
    public LoginFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LoginFragment", "getPresenter().getTime():" + getPresenter().getTime());
    }
}
