package com.mitegralbridge;
import android.widget.Toast;
import android.util.Log;



// https://facebook.github.io/react-native/


import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;  


public class MintegralBridgeModule extends ReactContextBaseJavaModule{
    private static ReactApplicationContext reactContext;

    MintegralBridgeModule(ReactApplicationContext context){
        super(context);
        reactContext = context; 
    }

    @Override
    public String getName(){
        return "MintegralAndroid";
    }

  @ReactMethod 
    public void addAds(){
        Log.d("MintegralBridgeModule", "MintegralAndroid");
        Toast.makeText(getReactApplicationContext(), "MintegralAndroid", 2).show();

    }
}
