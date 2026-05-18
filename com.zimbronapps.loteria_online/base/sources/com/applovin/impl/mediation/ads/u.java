package com.applovin.impl.mediation.ads;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl.b a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ u(MaxFullscreenAdImpl.b bVar, c3 c3Var) {
        this.a = bVar;
        this.b = c3Var;
    }

    public final void run() {
        MaxFullscreenAdImpl.b.f(this.a, this.b);
    }
}
