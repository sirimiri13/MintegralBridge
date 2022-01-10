package com.mitegralbridge;
import com.facebook.react.ReactActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;

import android.util.Log;
import java.util.Map;
import android.widget.Toast;




public class MainActivity extends ReactActivity {

  String TAG = "banner";

  @Override
  protected String getMainComponentName() {
    return "MitegralBridge";
  }


  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      this.initSDK();
    
  }



  private void initSDK() {
    Toast.makeText(getApplicationContext(), "main",10).show();


    MBridgeSDK sdk = MBridgeSDKFactory.getMBridgeSDK();
    Map<String, String> map = sdk.getMBConfigurationMap("158294", "b7d1652c2bfe263619de7fbb895cc135");

    sdk.init(map, this, new SDKInitStatusListener() {
        @Override
        public void onInitSuccess() {
            Log.d(TAG, "initSDK - onInitSuccess: ");
        }

        @Override
        public void onInitFail(String str) {
            Log.d(TAG, "initSDK - onInitFail: ");
        }
    });
}





}
