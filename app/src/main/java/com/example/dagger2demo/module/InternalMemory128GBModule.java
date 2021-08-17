package com.example.dagger2demo.module;

import com.example.dagger2demo.device.IInternalMemory;
import com.example.dagger2demo.device.InternalMemory128GB;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class InternalMemory128GBModule {

    @Binds
    abstract IInternalMemory bindInternalMemory(InternalMemory128GB internalMemory128GB);
}
