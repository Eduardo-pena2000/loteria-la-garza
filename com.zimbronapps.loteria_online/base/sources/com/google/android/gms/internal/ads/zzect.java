package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzect implements zzdel, zzdjy, zzdct {
    private final Context zza;
    private final zzdxz zzb;

    public zzect(Context context, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzdxzVar;
    }

    private final void zzf(Context context) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfz)).booleanValue()) {
            zzcei.zza.execute(new zzecs(this, context));
        }
    }

    public final /* synthetic */ void zzc(Context context) {
        R5.t.r().zza(context, this.zzb);
    }

    public final void zzd(b6.M m) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfC)).booleanValue()) {
            zzf(this.zza);
        }
    }

    public final void zzdO(zzbzu zzbzuVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfB)).booleanValue()) {
            zzf(this.zza);
        }
    }

    public final void zzdP(zzfjc zzfjcVar) {
    }

    public final void zze(String str) {
    }

    public final void zzg() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfD)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
