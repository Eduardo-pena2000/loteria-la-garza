package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.mediation.MaxAdListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ MediationServiceImpl a;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ MaxAdListener d;

    public /* synthetic */ j(MediationServiceImpl mediationServiceImpl, c3 c3Var, Long l, MaxAdListener maxAdListener) {
        this.a = mediationServiceImpl;
        this.b = c3Var;
        this.c = l;
        this.d = maxAdListener;
    }

    public final void run() {
        MediationServiceImpl.b(this.a, this.b, this.c, this.d);
    }
}
