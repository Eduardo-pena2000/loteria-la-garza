package com.google.android.gms.internal.ads;

import S5.c1;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfoa implements zzdir, zzdbv, zzdiv {
    private final zzfoo zza;
    private final zzfoe zzb;

    public zzfoa(Context context, zzfoo zzfooVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoe.zzn(context, 13);
    }

    public final void zza() {
        if (((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoo zzfooVar = this.zza;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzd(true);
            zzfooVar.zza(zzfoeVar);
        }
    }

    public final void zzb() {
    }

    public final void zzg() {
    }

    public final void zzh() {
        if (((Boolean) zzbix.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    public final void zzj(c1 c1Var) {
        if (((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoo zzfooVar = this.zza;
            zzfoe zzfoeVar = this.zzb;
            zzfoeVar.zzk(c1Var.M1().toString());
            zzfoeVar.zzd(false);
            zzfooVar.zza(zzfoeVar);
        }
    }
}
