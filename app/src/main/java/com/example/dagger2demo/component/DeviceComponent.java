package com.example.dagger2demo.component;

import com.example.dagger2demo.MainActivity;
import com.example.dagger2demo.device.Device;
import com.example.dagger2demo.module.InternalMemory64GBModule;
import com.example.dagger2demo.module.RamModule;
import com.example.dagger2demo.module.WirelessModule;

import dagger.Component;

@Component(modules = {WirelessModule.class, InternalMemory64GBModule.class, RamModule.class})
public interface DeviceComponent {

    void inject(MainActivity activity);

    Device getDevice();
}
