package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class Processor {
    @Inject
    Processor() {
        DebugUtils.log("Processor created for device.");
    }
}
