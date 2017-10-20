package com.dowob.newdaggertest.screen.main;

import com.dowob.newdaggertest.model.AppModel;

import javax.inject.Inject;

/**
 * Created by Wei on 2017/10/13.
 */

public class MainPresenter implements MainContract.Presenter {
    private AppModel appModel;

    @Inject
    public MainPresenter(AppModel appModel) {
        this.appModel = appModel;
    }

    public long getTimestamp() {
        return appModel.getTimestamp();
    }

    @Override
    public void attachView(MainContract.View view) {

    }

    @Override
    public void detachView() {

    }
}
