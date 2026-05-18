package com.applovin.impl.mediation.ads;

import com.applovin.impl.b3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ MaxAdViewImpl a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ e(MaxAdViewImpl maxAdViewImpl, b3 b3Var) {
        this.a = maxAdViewImpl;
        this.b = b3Var;
    }

    public final void run() {
        MaxAdViewImpl.n(this.a, this.b);
    }
}
