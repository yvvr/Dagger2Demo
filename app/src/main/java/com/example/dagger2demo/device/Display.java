package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class Display {
    @Inject
    Display(){
        DebugUtils.log("Display created");
    }
}
