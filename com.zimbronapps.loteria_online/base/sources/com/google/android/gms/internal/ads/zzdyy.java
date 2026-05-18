package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyy implements M5.e, zzdel, S5.a, zzdbf, zzdbz, zzdca, zzdct, zzdbi, zzfnv {
    private final List zza;
    private final zzdym zzb;
    private long zzc;

    public zzdyy(zzdym zzdymVar, zzcma zzcmaVar) {
        this.zzb = zzdymVar;
        this.zza = Collections.singletonList(zzcmaVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    public final void onAdClicked() {
        zzi(S5.a.class, "onAdClicked", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        zzi(M5.e.class, "onAppEvent", str, str2);
    }

    public final void zza(Context context) {
        zzi(zzdca.class, "onPause", context);
    }

    public final void zzb(Context context) {
        zzi(zzdca.class, "onResume", context);
    }

    public final void zzc(Context context) {
        zzi(zzdca.class, "onDestroy", context);
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzi(zzdbf.class, "onRewarded", zzcagVar, str, str2);
    }

    public final void zzdI(c1 c1Var) {
        zzi(zzdbi.class, "onAdFailedToLoad", Integer.valueOf(c1Var.a), c1Var.b, c1Var.c);
    }

    public final void zzdJ() {
        zzi(zzdbf.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzdK(zzfno zzfnoVar, String str) {
        zzi(zzfnn.class, "onTaskCreated", str);
    }

    public final void zzdL(zzfno zzfnoVar, String str) {
        zzi(zzfnn.class, "onTaskStarted", str);
    }

    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        zzi(zzfnn.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzdN(zzfno zzfnoVar, String str) {
        zzi(zzfnn.class, "onTaskSucceeded", str);
    }

    public final void zzdO(zzbzu zzbzuVar) {
        this.zzc = R5.t.o().b();
        zzi(zzdel.class, "onAdRequest", new Object[0]);
    }

    public final void zzdP(zzfjc zzfjcVar) {
    }

    public final void zzdr() {
        zzi(zzdbz.class, "onAdImpression", new Object[0]);
    }

    public final void zzds() {
        zzi(zzdbf.class, "onAdClosed", new Object[0]);
    }

    public final void zzdt() {
        zzi(zzdbf.class, "onAdOpened", new Object[0]);
    }

    public final void zze() {
        zzi(zzdbf.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void zzf() {
        zzi(zzdbf.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzg() {
        long b = R5.t.o().b() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(b);
        o0.k(sb.toString());
        zzi(zzdct.class, "onAdLoaded", new Object[0]);
    }
}
