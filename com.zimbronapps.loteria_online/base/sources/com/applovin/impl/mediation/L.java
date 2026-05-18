package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d5;
import com.applovin.impl.s4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ MediationServiceImpl a;
    public final /* synthetic */ s4 b;
    public final /* synthetic */ h c;
    public final /* synthetic */ MaxAdapterParametersImpl d;
    public final /* synthetic */ d5 e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ l(MediationServiceImpl mediationServiceImpl, s4 s4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, d5 d5Var, Activity activity) {
        this.a = mediationServiceImpl;
        this.b = s4Var;
        this.c = hVar;
        this.d = maxAdapterParametersImpl;
        this.e = d5Var;
        this.f = activity;
    }

    public final void run() {
        MediationServiceImpl.g(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
