package com.applovin.impl.mediation.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl a;
    public final /* synthetic */ Long b;

    public /* synthetic */ o(MaxFullscreenAdImpl maxFullscreenAdImpl, Long l) {
        this.a = maxFullscreenAdImpl;
        this.b = l;
    }

    public final void run() {
        MaxFullscreenAdImpl.n(this.a, this.b);
    }
}
