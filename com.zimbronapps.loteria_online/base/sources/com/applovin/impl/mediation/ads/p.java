package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl.b a;
    public final /* synthetic */ MaxAd b;

    public /* synthetic */ p(MaxFullscreenAdImpl.b bVar, MaxAd maxAd) {
        this.a = bVar;
        this.b = maxAd;
    }

    public final void run() {
        MaxFullscreenAdImpl.b.e(this.a, this.b);
    }
}
