package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxb implements zzfnv {
    private final Map zza;
    private final zzbgd zzb;

    public zzdxb(zzbgd zzbgdVar, Map map) {
        this.zza = map;
        this.zzb = zzbgdVar;
    }

    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    public final void zzdL(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            this.zzb.zzc(((zzdxa) map.get(zzfnoVar)).zza);
        }
    }

    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            this.zzb.zzc(((zzdxa) map.get(zzfnoVar)).zzc);
        }
    }

    public final void zzdN(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            this.zzb.zzc(((zzdxa) map.get(zzfnoVar)).zzb);
        }
    }
}
