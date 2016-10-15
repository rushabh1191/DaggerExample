package com.rushabh.dagger.modules;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rushabh on 15/10/16.
 */

@Module
public class MessengerModule {

    @Inject
    Context context;

    @Inject
    public MessengerModule(Context context){
        this.context=context;
    }

    public void showMessageToUser(){
        Toast.makeText(context,"Hi! I am called through Dagger",Toast.LENGTH_LONG).show();
    }




}
