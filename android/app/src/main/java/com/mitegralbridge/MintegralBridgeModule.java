package com.mitegralbridge;
import android.widget.Toast;
import android.util.Log;

import android.app.Activity;
import android.content.Intent;
import java.util.Map;



// https://facebook.github.io/react-native/


import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;  


import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;




public class MintegralBridgeModule extends ReactContextBaseJavaModule{
    private static ReactApplicationContext reactContext;

    MintegralBridgeModule(ReactApplicationContext context){
        super(context);
        reactContext = context; 
      //  this.initSDK() ;
    
    }


    @Override
    public String getName(){
        return "MintegralAndroid";
    };


  

  @ReactMethod 
    public void addAds(){
        Toast.makeText(getReactApplicationContext(), "MintegralAndroid", 2).show();
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, BannerActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        
       }
}
