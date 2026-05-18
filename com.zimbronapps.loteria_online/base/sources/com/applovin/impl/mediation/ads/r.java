package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl.b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MaxError c;

    public /* synthetic */ r(MaxFullscreenAdImpl.b bVar, String str, MaxError maxError) {
        this.a = bVar;
        this.b = str;
        this.c = maxError;
    }

    public final void run() {
        MaxFullscreenAdImpl.b.b(this.a, this.b, this.c);
    }
}
