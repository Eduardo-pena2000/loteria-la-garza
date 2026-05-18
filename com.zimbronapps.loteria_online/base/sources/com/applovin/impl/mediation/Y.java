package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d5;
import com.applovin.impl.s4;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ MaxSignalProvider b;
    public final /* synthetic */ MaxAdapterSignalCollectionParameters c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ d5 e;
    public final /* synthetic */ s4 f;

    public /* synthetic */ y(h hVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, s4 s4Var) {
        this.a = hVar;
        this.b = maxSignalProvider;
        this.c = maxAdapterSignalCollectionParameters;
        this.d = activity;
        this.e = d5Var;
        this.f = s4Var;
    }

    public final void run() {
        h.d(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
