package com.mitegralbridge;
import android.widget.Toast;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;


import com.facebook.react.ReactActivity;
import androidx.annotation.CallSuper;
import android.app.Activity;
import android.widget.LinearLayout;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;

import com.mitegralbridge.databinding.ActivityBannerBinding;

public class BannerActivity extends Activity {
    private ActivityBannerBinding binding;


   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBannerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MBBannerView mbBannerView = findViewById(R.id.mb_banner_view);
        System.out.println("banner");

        this.initBanner();

        mbBannerView.load();

    }


    @Override
    public void setContentView(int resId) {
        LinearLayout screenRootView = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;

        screenRootView.setLayoutParams(layoutParams);
        screenRootView.setOrientation(LinearLayout.VERTICAL);


        // Create your top view here
        MBBannerView mbBannerView = findViewById(R.id.mb_banner_view); // Replace this topview with your view 
        mbBannerView.setGravity(Gravity.CENTER_HORIZONTAL);

        screenRootView.addView(mbBannerView);
        super.setContentView(screenRootView);

    }



    /**
     * Initialize & show Banner Ads type
     */
    private void initBanner() {
        Toast.makeText(getApplicationContext(), "banner",10).show();

        MBBannerView mbBannerView = findViewById(R.id.mb_banner_view);
        mbBannerView.init(new BannerSize(BannerSize.DEV_SET_TYPE, 320, 90), "401046", "1693891");
        mbBannerView.setAllowShowCloseBtn(true);
        mbBannerView.setRefreshTime(15);


        this.setBannerAdListener(mbBannerView);
        // mbBannerView.load();

    }



    /**
     * Initialize Banner Ad listener
     *
     * @param mbBannerView
     */
    private void setBannerAdListener(MBBannerView mbBannerView) {
        mbBannerView.setBannerAdListener(new BannerAdListener() {
            public void onLoadFailed(MBridgeIds ids, String msg) {
             
          }

            @Override
            public void onLoadSuccessed(MBridgeIds ids) {
                
            }

            @Override
            public void onClick(MBridgeIds ids) {
                
            }
  

            @Override
            public void onLeaveApp(MBridgeIds ids) {
            
            }
  
  

            @Override
            public void showFullScreen(MBridgeIds ids) {
                //   Log.e(TAG, "showFullScreen");
            }

            @Override
          public void closeFullScreen(MBridgeIds ids) {
            // Log.e(TAG, "closeFullScreen");
          }

          @Override
          public void onLogImpression(MBridgeIds ids) {
         
          }


            @Override
        public void onCloseBanner(MBridgeIds ids) {
            // ShowToast("onCloseBanner");
            // Log.e(TAG, "onCloseBanner");
        }
        });
        mbBannerView.load();
    }


}