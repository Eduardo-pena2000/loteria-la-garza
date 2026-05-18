package com.applovin.impl.mediation.ads;

import android.app.Activity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Activity d;

    public /* synthetic */ n(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity) {
        this.a = maxFullscreenAdImpl;
        this.b = str;
        this.c = str2;
        this.d = activity;
    }

    public final void run() {
        MaxFullscreenAdImpl.d(this.a, this.b, this.c, this.d);
    }
}
