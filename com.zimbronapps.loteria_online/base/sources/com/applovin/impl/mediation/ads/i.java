package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ MaxFullscreenAdImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ androidx.lifecycle.k f;

    public /* synthetic */ i(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.k kVar) {
        this.a = maxFullscreenAdImpl;
        this.b = str;
        this.c = str2;
        this.d = activity;
        this.e = viewGroup;
        this.f = kVar;
    }

    public final void run() {
        MaxFullscreenAdImpl.o(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
