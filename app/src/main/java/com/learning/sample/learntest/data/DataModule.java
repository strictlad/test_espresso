package com.learning.sample.learntest.data;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Duc on 2/8/2017.
 */

@Module
public class DataModule {
    @Provides
    @Singleton
    public Api provideApi() {
        return new Api();
    }
}
