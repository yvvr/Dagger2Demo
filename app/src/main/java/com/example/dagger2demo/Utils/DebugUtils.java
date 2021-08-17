package com.example.dagger2demo.Utils;

import android.util.Log;

import javax.inject.Inject;

public class DebugUtils {

    @Inject
    DebugUtils() {}

    public static final String TAG = "DaggerLogging";

    public static void log(String msg){
        Log.d(TAG,msg);
    }
}
