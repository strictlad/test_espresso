package com.learning.sample.learntest;

import com.learning.sample.learntest.data.DebugDataModule;
import com.learning.sample.learntest.ui.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Duc on 2/8/2017.
 */

@Singleton
@Component(modules = {DebugDataModule.class})
public interface Graph {
    void inject(BaseActivity activity);
    void inject(InjectedBaseActivityTest test);

    class Initializer {
        public static Graph init(boolean mockMode) {
            return DaggerGraph.builder()
                    .debugDataModule(new DebugDataModule(mockMode))
                    .build();
        }
    }
}
