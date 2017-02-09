package com.learning.sample.learntest.data;


import org.mockito.AdditionalAnswers;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module
public class DebugDataModule {

    public boolean mockMode;

    public DebugDataModule(boolean provideMocks) {
        mockMode = provideMocks;
    }

    @Provides @Singleton
    Api provideApi() {
        if (mockMode) {
            return mock(Api.class);
        } else {
            return new Api();
        }
    }

}
