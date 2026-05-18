package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ AppLovinAdServiceImpl a;
    public final /* synthetic */ AppLovinAdLoadListener b;
    public final /* synthetic */ AppLovinAd c;

    public /* synthetic */ r(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        this.a = appLovinAdServiceImpl;
        this.b = appLovinAdLoadListener;
        this.c = appLovinAd;
    }

    public final void run() {
        AppLovinAdServiceImpl.f(this.a, this.b, this.c);
    }
}
