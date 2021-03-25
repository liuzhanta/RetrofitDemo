package com.tata.retrofitdemo;

import android.util.Log;

/**
 * @Description:
 * @Author: Terry
 * @Date: 3/24/21 8:16 PM
 */
public class Utils {
    public static void printStack(String TAG){
        for (StackTraceElement i : Thread.currentThread().getStackTrace()) {
            Log.i(TAG, i.toString());
        }
    }
}
