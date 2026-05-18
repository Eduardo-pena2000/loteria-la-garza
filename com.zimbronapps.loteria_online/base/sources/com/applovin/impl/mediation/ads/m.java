package com.applovin.impl.mediation.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl a;
    public final /* synthetic */ String b;

    public /* synthetic */ m(MaxFullscreenAdImpl maxFullscreenAdImpl, String str) {
        this.a = maxFullscreenAdImpl;
        this.b = str;
    }

    public final void run() {
        MaxFullscreenAdImpl.q(this.a, this.b);
    }
}
