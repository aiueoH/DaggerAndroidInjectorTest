package com.dowob.newdaggertest.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created by Wei on 2017/10/19.
 */

public abstract class BaseFragment<T extends BaseContract.Presenter> extends DaggerFragment implements BaseContract.View {
    @Inject
    T presenter;

    public T getPresenter() {
        return presenter;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter.attachView(this);
    }

    @Override
    public void onDetach() {
        presenter.detachView();
        super.onDetach();
    }
}
