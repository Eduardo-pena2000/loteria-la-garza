package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfra {
    private final long zza;
    private final long zzb;
    private final E6.f zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzh = new Random();
    private long zzc = 0;

    public zzfra(long j, double d, long j2, double d2, E6.f fVar) {
        this.zza = j;
        this.zzb = j2;
        this.zzf = fVar;
        zza();
    }

    public final void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final long zzb() {
        double d = this.zzg;
        double d2 = 0.2d * d;
        long j = (long) (d + d2);
        return ((long) (d - d2)) + ((long) (this.zzh.nextDouble() * ((j - r0) + 1)));
    }

    public final void zzc() {
        this.zze = this.zzf.a() + zzb();
        double d = this.zzg;
        this.zzg = Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        return this.zzf.a() < this.zze;
    }

    public final boolean zze() {
        zzbgv zzbgvVar = zzbhe.zzJ;
        return ((Integer) S5.D.c().zzd(zzbgvVar)).intValue() >= 0 && this.zzc > Math.max(this.zzd, (long) ((Integer) S5.D.c().zzd(zzbgvVar)).intValue()) && this.zzg >= this.zzb;
    }

    public final synchronized void zzf(int i) {
        com.google.android.gms.common.internal.t.a(i > 0);
        this.zzd = i;
    }
}
