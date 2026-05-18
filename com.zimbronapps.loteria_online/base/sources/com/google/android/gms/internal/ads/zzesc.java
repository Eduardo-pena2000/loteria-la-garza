package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesc {
    private final zzdor zza;
    private final zzerp zzb;
    private final zzdbi zzc;

    public zzesc(zzdor zzdorVar, zzdxz zzdxzVar) {
        this.zza = zzdorVar;
        zzerp zzerpVar = new zzerp(zzdxzVar);
        this.zzb = zzerpVar;
        this.zzc = new zzesb(zzerpVar, zzdorVar.zze());
    }

    public final void zza(S5.K k) {
        this.zzb.zzl(k);
    }

    public final zzdml zzb() {
        return new zzdml(this.zza, this.zzb.zzi());
    }

    public final zzerp zzc() {
        return this.zzb;
    }

    public final zzdct zzd() {
        return this.zzb;
    }

    public final zzdbi zze() {
        return this.zzc;
    }
}
