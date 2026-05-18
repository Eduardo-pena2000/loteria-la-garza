package com.google.ads.mediation;

import L5.n;
import Y5.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends X5.b {
    public final AbstractAdViewAdapter a;
    public final t b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, t tVar) {
        this.a = abstractAdViewAdapter;
        this.b = tVar;
    }

    public final void onAdFailedToLoad(n nVar) {
        this.b.onAdFailedToLoad(this.a, nVar);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        X5.a aVar = (X5.a) obj;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        t tVar = this.b;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, tVar));
        tVar.onAdLoaded(abstractAdViewAdapter);
    }
}
