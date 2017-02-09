package com.learning.sample.learntest.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.learning.sample.learntest.App;
import com.learning.sample.learntest.data.Api;

import javax.inject.Inject;

/**
 * Created by Duc on 2/8/2017.
 */

public abstract class BaseActivity extends AppCompatActivity{
    @Inject
    Api mApi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getInstance().graph().inject(this);
    }

    public Api getApi(){
        return mApi;
    }
}
