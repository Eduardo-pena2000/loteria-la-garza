package com.applovin.impl.mediation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ w(h hVar, Runnable runnable) {
        this.a = hVar;
        this.b = runnable;
    }

    public final void run() {
        h.h(this.a, this.b);
    }
}
