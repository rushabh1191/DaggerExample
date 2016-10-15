package com.rushabh.dagger.components;

import com.rushabh.dagger.MainActivity;
import com.rushabh.dagger.modules.ApplicationModule;
import com.rushabh.dagger.modules.MessengerModule;

import dagger.Component;

/**
 * Created by rushabh on 15/10/16.
 */

@Component(modules = {ApplicationModule.class,MessengerModule.class})
public interface MessengerComponent {
    void inject(MainActivity activity);
}
