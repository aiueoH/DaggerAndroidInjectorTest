package com.dowob.newdaggertest.screen.main.login;

import com.dowob.newdaggertest.mvp.BaseContract;

/**
 * Created by Wei on 2017/10/19.
 */

public interface LoginContract {
    interface View extends BaseContract.View {

    }

    interface Presenter extends BaseContract.Presenter<View> {
        long getTime();
    }
}
