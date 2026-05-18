package com.google.ads.mediation;

import Y5.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends L5.e implements M5.e, S5.a {
    public final AbstractAdViewAdapter a;
    public final n b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.a = abstractAdViewAdapter;
        this.b = nVar;
    }

    public final void onAdClicked() {
        this.b.onAdClicked(this.a);
    }

    public final void onAdClosed() {
        this.b.onAdClosed(this.a);
    }

    public final void onAdFailedToLoad(L5.n nVar) {
        this.b.onAdFailedToLoad(this.a, nVar);
    }

    public final void onAdLoaded() {
        this.b.onAdLoaded(this.a);
    }

    public final void onAdOpened() {
        this.b.onAdOpened(this.a);
    }

    public final void onAppEvent(String str, String str2) {
        this.b.zza(this.a, str, str2);
    }
}
