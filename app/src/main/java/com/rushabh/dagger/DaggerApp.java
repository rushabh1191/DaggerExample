package com.rushabh.dagger;

import android.app.Application;

import com.rushabh.dagger.components.DaggerMessengerComponent;
import com.rushabh.dagger.components.MessengerComponent;
import com.rushabh.dagger.modules.ApplicationModule;
import com.rushabh.dagger.modules.MessengerModule;

/**
 * Created by rushabh on 15/10/16.
 */

public class DaggerApp extends Application {

    private MessengerComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent=DaggerMessengerComponent.builder().messengerModule(new MessengerModule(this)).
                applicationModule(new ApplicationModule(this)).build();

    }

    public MessengerComponent getApplicationComponent() {
        return applicationComponent;
    }
}
