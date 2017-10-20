package com.dowob.newdaggertest.screen.main.login;

import com.dowob.newdaggertest.model.AppModel;

import javax.inject.Inject;

/**
 * Created by Wei on 2017/10/19.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private AppModel appModel;

    @Inject
    public LoginPresenter(AppModel appModel) {
        this.appModel = appModel;
    }

    @Override
    public void attachView(LoginContract.View view) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public long getTime() {
        return appModel.getTimestamp();
    }
}
