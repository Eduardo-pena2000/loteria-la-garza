package com.applovin.impl.mediation;

import com.applovin.impl.mediation.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ d.b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ t(d.b bVar, int i, String str) {
        this.a = bVar;
        this.b = i;
        this.c = str;
    }

    public final void run() {
        d.b.a(this.a, this.b, this.c);
    }
}
