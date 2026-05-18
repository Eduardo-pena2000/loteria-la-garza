package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.y2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ MediationServiceImpl a;
    public final /* synthetic */ h b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MaxAdapterParametersImpl d;
    public final /* synthetic */ y2 e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ a.a g;

    public /* synthetic */ o(MediationServiceImpl mediationServiceImpl, h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, y2 y2Var, Activity activity, a.a aVar) {
        this.a = mediationServiceImpl;
        this.b = hVar;
        this.c = str;
        this.d = maxAdapterParametersImpl;
        this.e = y2Var;
        this.f = activity;
        this.g = aVar;
    }

    public final void run() {
        MediationServiceImpl.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
