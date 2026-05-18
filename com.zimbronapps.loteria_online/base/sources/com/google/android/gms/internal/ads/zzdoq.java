package com.google.android.gms.internal.ads;

import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdoq {
    zzblt zza;
    zzblq zzb;
    zzbmg zzc;
    zzbmd zzd;
    zzbrb zze;
    final i0 zzf = new i0();
    final i0 zzg = new i0();

    public final zzdoq zza(zzblt zzbltVar) {
        this.zza = zzbltVar;
        return this;
    }

    public final zzdoq zzb(zzblq zzblqVar) {
        this.zzb = zzblqVar;
        return this;
    }

    public final zzdoq zzc(zzbmg zzbmgVar) {
        this.zzc = zzbmgVar;
        return this;
    }

    public final zzdoq zzd(zzbmd zzbmdVar) {
        this.zzd = zzbmdVar;
        return this;
    }

    public final zzdoq zze(zzbrb zzbrbVar) {
        this.zze = zzbrbVar;
        return this;
    }

    public final zzdoq zzf(String str, zzblz zzblzVar, zzblw zzblwVar) {
        this.zzf.put(str, zzblzVar);
        if (zzblwVar != null) {
            this.zzg.put(str, zzblwVar);
        }
        return this;
    }

    public final zzdor zzg() {
        return new zzdor(this, null);
    }
}
