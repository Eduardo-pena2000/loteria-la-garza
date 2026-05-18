package com.applovin.impl.mediation;

import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ MediationServiceImpl.b a;
    public final /* synthetic */ MaxAd b;

    public /* synthetic */ q(MediationServiceImpl.b bVar, MaxAd maxAd) {
        this.a = bVar;
        this.b = maxAd;
    }

    public final void run() {
        MediationServiceImpl.b.a(this.a, this.b);
    }
}
