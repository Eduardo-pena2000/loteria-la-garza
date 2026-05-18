package com.applovin.impl.mediation;

import com.applovin.impl.mediation.h;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ h.c a;
    public final /* synthetic */ MaxAdapter.InitializationStatus b;
    public final /* synthetic */ String c;

    public /* synthetic */ c0(h.c cVar, MaxAdapter.InitializationStatus initializationStatus, String str) {
        this.a = cVar;
        this.b = initializationStatus;
        this.c = str;
    }

    public final void run() {
        h.c.a(this.a, this.b, this.c);
    }
}
