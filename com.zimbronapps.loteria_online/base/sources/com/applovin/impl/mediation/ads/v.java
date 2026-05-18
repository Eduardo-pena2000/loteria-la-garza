package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ MaxNativeAdLoaderImpl.c a;
    public final /* synthetic */ MaxAd b;

    public /* synthetic */ v(MaxNativeAdLoaderImpl.c cVar, MaxAd maxAd) {
        this.a = cVar;
        this.b = maxAd;
    }

    public final void run() {
        MaxNativeAdLoaderImpl.c.a(this.a, this.b);
    }
}
