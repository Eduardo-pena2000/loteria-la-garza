package com.applovin.mediation.adapters;

import com.applovin.sdk.AppLovinAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ AppLovinAdapterAdViewListener a;
    public final /* synthetic */ AppLovinAd b;

    public /* synthetic */ a(AppLovinAdapterAdViewListener appLovinAdapterAdViewListener, AppLovinAd appLovinAd) {
        this.a = appLovinAdapterAdViewListener;
        this.b = appLovinAd;
    }

    public final void run() {
        AppLovinAdapterAdViewListener.a(this.a, this.b);
    }
}
