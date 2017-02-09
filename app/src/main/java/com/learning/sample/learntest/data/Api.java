package com.learning.sample.learntest.data;

import rx.Observable;

/**
 * Created by Duc on 2/8/2017.
 */

public class Api {
    public Observable<Boolean> login(String username, String password){
        return Observable.just(true);
    }
}
