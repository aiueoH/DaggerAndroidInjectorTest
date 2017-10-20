package com.dowob.newdaggertest.mvp;

/**
 * Created by Wei on 2017/10/13.
 */

public class BaseContract {
    public interface View {}

    public interface Presenter<V extends View> {
        void attachView(V v);
        void detachView();
    }
}
