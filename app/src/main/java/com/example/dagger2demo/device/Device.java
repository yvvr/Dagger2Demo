package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;
import com.example.dagger2demo.module.Ram8GB;

import javax.inject.Inject;
import javax.inject.Named;

public class Device {

    Processor mProcessor;
    Display mDisplay;
    Battery mBattery;
    IRam mRam;
    IInternalMemory mInternalMemory;
    WirelessComm mWirelessComm;

    @Inject
    Device(
            Processor processor,
            Display display,
            @Ram8GB IRam ram,
            IInternalMemory internalMemory,
            Battery battery,
            WirelessComm wirelessComm) {

        mProcessor = processor;
        mDisplay = display;
        mRam = ram;
        mInternalMemory = internalMemory;
        mBattery = battery;
        mWirelessComm = wirelessComm;

        DebugUtils.log("Overall Device is created");
    }

    public void run() {
        DebugUtils.log("Device is running");
    }
}
