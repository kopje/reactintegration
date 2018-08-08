package com.example.ben.onedrivereact;

import android.app.Application;
import android.content.Context;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;

/**
 * @author kepingz
 * @since 8/8/18.
 */
public final class ReactInstanceManagerSingleton {

    // TODO: Synchronization
    private static ReactInstanceManager sReactInstanceManager;

    public static ReactInstanceManager getInstance(Application application) {
        if (sReactInstanceManager == null) {
            sReactInstanceManager = ReactInstanceManager.builder()
                    .setApplication(application)
                    .setBundleAssetName("index.android.bundle")
                    .setJSMainModulePath("index")
                    .addPackage(new MainReactPackage())
                    .setUseDeveloperSupport(BuildConfig.DEBUG)
                    .setInitialLifecycleState(LifecycleState.RESUMED)
                    .build();
        }
        return sReactInstanceManager;
    }
}
