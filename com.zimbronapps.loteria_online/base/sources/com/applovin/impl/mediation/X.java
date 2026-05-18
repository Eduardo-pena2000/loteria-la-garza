package com.applovin.impl.mediation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ x(h hVar, String str, Runnable runnable) {
        this.a = hVar;
        this.b = str;
        this.c = runnable;
    }

    public final void run() {
        h.p(this.a, this.b, this.c);
    }
}
