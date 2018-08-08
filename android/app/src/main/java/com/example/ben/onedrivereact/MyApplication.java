package com.example.ben.onedrivereact;

import android.app.Application;
import android.util.Log;

/**
 * @author kepingz
 * @since 8/8/18.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, final Throwable error) {
                Log.e("MyApplication", "uncaughtException on thread: " + thread.getId() + " - " + thread.getName(), error);
            }
        });
    }
}
