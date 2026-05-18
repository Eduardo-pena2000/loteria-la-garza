package com.applovin.impl.mediation.ads;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl.b a;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ MaxAd c;

    public /* synthetic */ q(MaxFullscreenAdImpl.b bVar, c3 c3Var, MaxAd maxAd) {
        this.a = bVar;
        this.b = c3Var;
        this.c = maxAd;
    }

    public final void run() {
        MaxFullscreenAdImpl.b.c(this.a, this.b, this.c);
    }
}
