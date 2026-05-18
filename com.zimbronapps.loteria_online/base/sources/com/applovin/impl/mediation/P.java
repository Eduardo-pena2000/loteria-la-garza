package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ MediationServiceImpl a;
    public final /* synthetic */ c3 b;
    public final /* synthetic */ h c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ androidx.lifecycle.k e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ a.a g;

    public /* synthetic */ p(MediationServiceImpl mediationServiceImpl, c3 c3Var, h hVar, ViewGroup viewGroup, androidx.lifecycle.k kVar, Activity activity, a.a aVar) {
        this.a = mediationServiceImpl;
        this.b = c3Var;
        this.c = hVar;
        this.d = viewGroup;
        this.e = kVar;
        this.f = activity;
        this.g = aVar;
    }

    public final void run() {
        MediationServiceImpl.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
