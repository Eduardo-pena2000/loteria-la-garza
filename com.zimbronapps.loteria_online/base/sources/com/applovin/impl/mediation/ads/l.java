package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ com.applovin.impl.i d;

    public /* synthetic */ l(MaxFullscreenAdImpl maxFullscreenAdImpl, Activity activity, Context context, com.applovin.impl.i iVar) {
        this.a = maxFullscreenAdImpl;
        this.b = activity;
        this.c = context;
        this.d = iVar;
    }

    public final void run() {
        MaxFullscreenAdImpl.p(this.a, this.b, this.c, this.d);
    }
}
