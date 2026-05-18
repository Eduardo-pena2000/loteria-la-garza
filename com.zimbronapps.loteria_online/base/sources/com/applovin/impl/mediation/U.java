package com.applovin.impl.mediation;

import com.applovin.impl.mediation.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ e.b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ u(e.b bVar, int i, String str) {
        this.a = bVar;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        e.b.a(this.a, this.b, this.c);
    }
}
