package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class Ram8GB implements IRam {
    @Inject
    Ram8GB() {
        DebugUtils.log("Ram of 8GB created.");
    }
}
