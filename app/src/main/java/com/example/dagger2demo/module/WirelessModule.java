package com.example.dagger2demo.module;

import com.example.dagger2demo.wireless.Bluetooth;
import com.example.dagger2demo.wireless.GPS;
import com.example.dagger2demo.wireless.WiFi;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WirelessModule {

    @Provides
    static WiFi providesWifi() {
        return new WiFi();
    }

    @Provides
    static Bluetooth providesBluetooth() {
        return new Bluetooth();
    }

    @Provides
    static GPS providesGPS() {
        return new GPS();
    }
}
