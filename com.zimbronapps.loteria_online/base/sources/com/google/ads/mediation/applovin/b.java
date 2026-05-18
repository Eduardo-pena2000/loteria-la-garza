package com.google.ads.mediation.applovin;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b {
    public final AppLovinAdView a;
    public final FrameLayout b;

    public b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, FrameLayout frameLayout, Context context) {
        AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
        this.a = appLovinAdView;
        this.b = frameLayout;
        frameLayout.addView(appLovinAdView);
    }

    public static b b(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, L5.h hVar, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hVar.k(context), hVar.d(context));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        return new b(appLovinSdk, appLovinAdSize, frameLayout, context);
    }

    public FrameLayout a() {
        return this.b;
    }

    public void c(AppLovinAd appLovinAd) {
        this.a.renderAd(appLovinAd);
    }

    public void d(AppLovinAdClickListener appLovinAdClickListener) {
        this.a.setAdClickListener(appLovinAdClickListener);
    }

    public void e(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.a.setAdDisplayListener(appLovinAdDisplayListener);
    }

    public void f(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.a.setAdViewEventListener(appLovinAdViewEventListener);
    }
}
