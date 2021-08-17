package com.example.dagger2demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.component.DaggerDeviceComponent;
import com.example.dagger2demo.component.DeviceComponent;
import com.example.dagger2demo.device.Device;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject protected Device mDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DeviceComponent component = DaggerDeviceComponent.create();
        component.inject(this);

        mDevice.run();
    }
}