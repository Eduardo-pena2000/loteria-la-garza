package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzflx {
    private final long zza;
    private long zzc;
    private final zzflw zzb = new zzflw();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzflx() {
        long a = R5.t.o().a();
        this.zza = a;
        this.zzc = a;
    }

    public final void zza() {
        this.zzc = R5.t.o().a();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final zzflw zzg() {
        zzflw zzflwVar = this.zzb;
        zzflw clone = zzflwVar.clone();
        zzflwVar.zza = false;
        zzflwVar.zzb = 0;
        return clone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
