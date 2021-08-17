package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class Battery {
    @Inject
    Battery() {
        DebugUtils.log("Battery created");
    }
}
