package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ AppLovinAdLoadListener a;
    public final /* synthetic */ com.applovin.impl.sdk.ad.b b;

    public /* synthetic */ t(AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.ad.b bVar) {
        this.a = appLovinAdLoadListener;
        this.b = bVar;
    }

    public final void run() {
        AppLovinAdServiceImpl.e(this.a, this.b);
    }
}
