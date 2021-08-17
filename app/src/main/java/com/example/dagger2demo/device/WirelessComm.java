package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;
import com.example.dagger2demo.wireless.Bluetooth;
import com.example.dagger2demo.wireless.GPS;
import com.example.dagger2demo.wireless.WiFi;

import javax.inject.Inject;

public class WirelessComm {
    WiFi mWiFi;
    Bluetooth mBluetooth;
    GPS mGPS;

    @Inject
    WirelessComm(WiFi wiFi, Bluetooth bluetooth, GPS gps){
        mWiFi = wiFi;
        mBluetooth = bluetooth;
        mGPS = gps;
        DebugUtils.log("Overall WirelessComm System created");
    }
}
