package com.applovin.impl.mediation.ads;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl.b a;
    public final /* synthetic */ MaxAd b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c3 d;
    public final /* synthetic */ MaxError e;

    public /* synthetic */ t(MaxFullscreenAdImpl.b bVar, MaxAd maxAd, boolean z, c3 c3Var, MaxError maxError) {
        this.a = bVar;
        this.b = maxAd;
        this.c = z;
        this.d = c3Var;
        this.e = maxError;
    }

    public final void run() {
        MaxFullscreenAdImpl.b.a(this.a, this.b, this.c, this.d, this.e);
    }
}
