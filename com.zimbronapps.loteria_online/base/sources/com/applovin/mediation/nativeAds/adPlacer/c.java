package com.applovin.mediation.nativeAds.adPlacer;

import java.util.Collection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ MaxAdPlacer a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ c(MaxAdPlacer maxAdPlacer, int i, Collection collection) {
        this.a = maxAdPlacer;
        this.b = i;
        this.c = collection;
    }

    public final void run() {
        MaxAdPlacer.b(this.a, this.b, this.c);
    }
}
