package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ AppLovinAdServiceImpl a;
    public final /* synthetic */ AppLovinError b;
    public final /* synthetic */ AppLovinAdLoadListener c;

    public /* synthetic */ u(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a = appLovinAdServiceImpl;
        this.b = appLovinError;
        this.c = appLovinAdLoadListener;
    }

    public final void run() {
        AppLovinAdServiceImpl.b(this.a, this.b, this.c);
    }
}
