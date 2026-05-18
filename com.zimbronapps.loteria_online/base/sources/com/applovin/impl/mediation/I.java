package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ MediationServiceImpl a;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ h c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ a.a e;

    public /* synthetic */ i(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, Activity activity, a.a aVar) {
        this.a = mediationServiceImpl;
        this.b = c3Var;
        this.c = hVar;
        this.d = activity;
        this.e = aVar;
    }

    public final void run() {
        MediationServiceImpl.e(this.a, this.b, this.c, this.d, this.e);
    }
}
