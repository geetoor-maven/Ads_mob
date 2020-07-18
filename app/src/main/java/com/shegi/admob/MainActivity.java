package com.shegi.admob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    Button button;
    AdView adView,adView1,adView2,adView3;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        adView1 = findViewById(R.id.adView1);
        adView = findViewById(R.id.adView);
        adView2 = findViewById(R.id.adView2);
        adView3 = findViewById(R.id.adView3);



        // iklan 0
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        // iklan 1
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);
        // iklan 2
        AdRequest adRequest3 = new AdRequest.Builder().build();
        adView2.loadAd(adRequest3);
        // iklan 3
        AdRequest adRequest4 = new AdRequest.Builder().build();
        adView3.loadAd(adRequest4);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isLoaded()){
                    interstitialAd.show();
                }
            }
        });

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3890356073486760/9013254002");
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest2);





    }
}
