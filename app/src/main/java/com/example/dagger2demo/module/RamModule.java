package com.example.dagger2demo.module;

import com.example.dagger2demo.device.IRam;
import com.example.dagger2demo.device.Ram6GB;
import com.example.dagger2demo.device.Ram8GB;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class RamModule {

    @Binds
    @com.example.dagger2demo.module.Ram8GB
    abstract IRam bind6GBRam(Ram6GB ram6GB);

    @Binds
    @com.example.dagger2demo.module.Ram6GB
    abstract IRam bind8GBRam(Ram8GB ram8GB);
}
