package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzajk extends zzaek implements zzajr {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzajk(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, false);
        this.zza = j2;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j == -1 ? -1L : j;
    }

    public final long zze(long j) {
        return zzd(j);
    }

    public final long zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zzb;
    }

    public final zzajk zzh(long j) {
        return new zzajk(j, this.zza, this.zzb, this.zzc, false);
    }
}
