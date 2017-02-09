package com.learning.sample.learntest;

import com.learning.sample.learntest.data.DataModule;
import com.learning.sample.learntest.ui.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Duc on 2/8/2017.
 */

@Singleton
@Component(modules = {DataModule.class})
public interface Graph {

    void inject(BaseActivity activity);

    public final static class Initializer {
        public static Graph init(boolean mockMode) {
            return DaggerGraph.builder()
                    .build();
        }
    }
}
