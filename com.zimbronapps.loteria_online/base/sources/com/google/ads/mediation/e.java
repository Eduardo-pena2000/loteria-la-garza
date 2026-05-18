package com.google.ads.mediation;

import L5.n;
import O5.h;
import O5.l;
import O5.m;
import O5.o;
import Y5.v;
import com.google.android.gms.internal.ads.zzbln;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends L5.e implements o, m, l {
    public final AbstractAdViewAdapter a;
    public final v b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, v vVar) {
        this.a = abstractAdViewAdapter;
        this.b = vVar;
    }

    public final void a(h hVar) {
        this.b.onAdLoaded(this.a, new a(hVar));
    }

    public final void b(zzbln zzblnVar, String str) {
        this.b.zzd(this.a, zzblnVar, str);
    }

    public final void c(zzbln zzblnVar) {
        this.b.zzc(this.a, zzblnVar);
    }

    public final void onAdClicked() {
        this.b.onAdClicked(this.a);
    }

    public final void onAdClosed() {
        this.b.onAdClosed(this.a);
    }

    public final void onAdFailedToLoad(n nVar) {
        this.b.onAdFailedToLoad(this.a, nVar);
    }

    public final void onAdImpression() {
        this.b.onAdImpression(this.a);
    }

    public final void onAdLoaded() {
    }

    public final void onAdOpened() {
        this.b.onAdOpened(this.a);
    }
}
