package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdns implements zzgzl {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdoc zzb;

    public zzdns(zzdoc zzdocVar, String str, boolean z) {
        Objects.requireNonNull(zzdocVar);
        this.zzb = zzdocVar;
    }

    public final void zza(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgr)).booleanValue()) {
            R5.t.l().zzh(th, "omid native display exp");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdoc zzdocVar = this.zzb;
        zzdocVar.zzZ().zzo((zzcjl) obj);
        String str = this.zza;
        zzcen zzY = zzdocVar.zzZ().zzY();
        zzekb zzL = zzdocVar.zzL(str, true);
        if (zzL != null && zzY != null) {
            zzY.zzc(zzL);
        } else if (zzY != null) {
            zzY.cancel(false);
        }
    }
}
