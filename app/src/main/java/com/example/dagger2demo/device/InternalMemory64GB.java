package com.example.dagger2demo.device;

import com.example.dagger2demo.Utils.DebugUtils;

import javax.inject.Inject;

public class InternalMemory64GB implements IInternalMemory {
    @Inject
    InternalMemory64GB() {
        DebugUtils.log("Internal Memory of 64GB created");
    }
}
