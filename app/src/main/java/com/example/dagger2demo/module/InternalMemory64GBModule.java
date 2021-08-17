package com.example.dagger2demo.module;

import com.example.dagger2demo.device.IInternalMemory;
import com.example.dagger2demo.device.InternalMemory64GB;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class InternalMemory64GBModule {

    @Binds
    abstract IInternalMemory bindInternalMemory(InternalMemory64GB internalMemory64GB);
}
