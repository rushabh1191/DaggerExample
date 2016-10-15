package com.rushabh.dagger;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rushabh.dagger.modules.MessengerModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    MessengerModule messenger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerApp)getApplication()).getApplicationComponent().inject(this);
        messenger.showMessageToUser();

    }
}
