package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ MaxAdViewImpl a;
    public final /* synthetic */ a.a b;
    public final /* synthetic */ com.applovin.impl.i c;

    public /* synthetic */ f(MaxAdViewImpl maxAdViewImpl, a.a aVar, com.applovin.impl.i iVar) {
        this.a = maxAdViewImpl;
        this.b = aVar;
        this.c = iVar;
    }

    public final void run() {
        MaxAdViewImpl.m(this.a, this.b, this.c);
    }
}
