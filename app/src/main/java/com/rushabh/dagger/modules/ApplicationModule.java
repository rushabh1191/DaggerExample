package com.rushabh.dagger.modules;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lem on 5/13/2015.
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideApplicationContext() {
        return application.getApplicationContext();
    }

    @Provides
    MessengerModule getMessenger(Context context){
        return new MessengerModule(context);
    }

}
