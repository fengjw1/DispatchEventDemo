package com.fengjw.dispatcheventdemo;

import android.util.Log;

public class Util {

    private static final boolean DEBUG = true;
    public static void debug(String str){
        if (DEBUG)
            Log.d("fengjw", str);
    }

}
