package com.gps.observer;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class GpsObserver implements Observer {

    public void onSubscribe(Disposable disposable) {

    }

    public void onNext(Object o) {
        System.out.println("o" + o.toString());
    }

    public void onError(Throwable throwable) {

    }

    public void onComplete() {

    }
}
