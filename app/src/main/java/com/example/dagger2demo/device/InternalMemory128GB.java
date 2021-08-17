package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class InternalMemory128GB implements IInternalMemory {
    @Inject
    InternalMemory128GB() {
        DebugUtils.log("Internal Memory of 128GB created");
    }
}
