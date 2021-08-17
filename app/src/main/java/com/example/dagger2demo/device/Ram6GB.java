package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class Ram6GB implements IRam {
    @Inject
    Ram6GB() {
        DebugUtils.log("Ram of 6GB created");
    }
}
