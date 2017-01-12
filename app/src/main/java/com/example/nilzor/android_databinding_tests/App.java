package com.example.nilzor.android_databinding_tests;

import android.app.Application;

public class App extends Application {
    public static MainViewModel MainVM;

    @Override
    public void onCreate() {
        super.onCreate();
        MainVM = new MainViewModel();
    }
}
