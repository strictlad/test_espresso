package com.learning.sample.learntest;

import android.app.Application;

/**
 * Created by Duc on 2/8/2017.
 */

public class App extends Application{
    private static App instance;
    private Graph graph;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        graph = Graph.Initializer.init(false);
    }

    public static App getInstance(){
        return instance;
    }

    public Graph graph(){
        return graph;
    }

    public void setMockMode(boolean useMock){
        graph = Graph.Initializer.init(useMock);
    }
}
