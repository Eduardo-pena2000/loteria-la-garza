package com.google.android.gms.internal.firebase-auth-api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbs implements zzoa {
    private static final zzbu zza = new zzbr();
    private final zzbi zzb;
    private final zzxc zzc;
    private final zzbk zzd;
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final zzbu zzh;

    public /* synthetic */ zzbs(zzbi zzbiVar, zzxc zzxcVar, int i, boolean z, boolean z2, zzbu zzbuVar, zzbt zzbtVar) {
        this(zzbiVar, zzxcVar, i, z, z2, zzbuVar);
    }

    public static /* bridge */ /* synthetic */ int zza(zzbs zzbsVar) {
        return zzbsVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzbi zzb(zzbs zzbsVar) {
        return zzbsVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzxc zzc(zzbs zzbsVar) {
        return zzbsVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzbu zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzbs zzbsVar) {
        return zzbsVar.zzf;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbs zzbsVar) {
        return zzbsVar.zzg;
    }

    private zzbs(zzbi zzbiVar, zzxc zzxcVar, int i, boolean z, boolean z2, zzbu zzbuVar) {
        this.zzb = zzbiVar;
        this.zzc = zzxcVar;
        int i2 = zzbo.zza[zzxcVar.ordinal()];
        this.zzd = i2 != 1 ? i2 != 2 ? zzbk.zzb : zzbk.zzc : zzbk.zza;
        this.zze = i;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = zzbuVar;
    }

    public static /* synthetic */ void zzd(zzbs zzbsVar) {
    }

    public final int zza() {
        return this.zze;
    }

    public final zzbi zzb() {
        this.zzh.zza(this);
        return this.zzb;
    }

    public final zzbk zzc() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zzf;
    }
}
