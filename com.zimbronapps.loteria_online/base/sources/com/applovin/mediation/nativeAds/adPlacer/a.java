package com.applovin.mediation.nativeAds.adPlacer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ MaxAdPlacer a;
    public final /* synthetic */ int b;

    public /* synthetic */ a(MaxAdPlacer maxAdPlacer, int i) {
        this.a = maxAdPlacer;
        this.b = i;
    }

    public final void run() {
        MaxAdPlacer.a(this.a, this.b);
    }
}
