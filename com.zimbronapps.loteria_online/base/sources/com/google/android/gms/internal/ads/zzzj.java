package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzzj implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzzj(zzv zzvVar, int i) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzmn.zzaa(i, false);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzj zzzjVar) {
        return zzgts.zzg().zzd(this.zzb, zzzjVar.zzb).zzd(this.zza, zzzjVar.zza).zze();
    }
}
