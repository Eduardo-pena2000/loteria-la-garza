package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbq {
    private boolean zza;
    private zzbk zzb;
    private final zzcb zzc;
    private zzbp zzd;
    private zzbn zze;

    public /* synthetic */ zzbq(zzcb zzcbVar, zzbt zzbtVar) {
        this(zzcbVar);
    }

    public static /* bridge */ /* synthetic */ zzbk zza(zzbq zzbqVar) {
        return zzbqVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzbp zzb(zzbq zzbqVar) {
        return zzbqVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbn zzc(zzbq zzbqVar) {
        return zzbqVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzcb zzd(zzbq zzbqVar) {
        return zzbqVar.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzbq zzbqVar) {
        return zzbqVar.zza;
    }

    private zzbq(zzcb zzcbVar) {
        this.zzb = zzbk.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzcbVar;
    }

    public static /* bridge */ /* synthetic */ void zza(zzbq zzbqVar, zzbn zzbnVar) {
        zzbqVar.zze = zzbnVar;
    }

    public final zzbq zzb() {
        this.zzd = zzbp.zzb();
        return this;
    }

    public static /* bridge */ /* synthetic */ void zza(zzbq zzbqVar, boolean z) {
        zzbqVar.zza = false;
    }

    public final zzbq zza() {
        zzbn zzbnVar = this.zze;
        if (zzbnVar != null) {
            zzbn.zza(zzbnVar);
        }
        this.zza = true;
        return this;
    }
}
