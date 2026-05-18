package com.applovin.impl.sdk.nativeAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ AppLovinNativeAdImpl b;

    public /* synthetic */ q(b bVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        this.a = bVar;
        this.b = appLovinNativeAdImpl;
    }

    public final void run() {
        b.e(this.a, this.b);
    }
}
