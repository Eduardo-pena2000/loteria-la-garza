package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzaek implements zzafy {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaek(long j, long j2, int i, int i2, boolean z) {
        long zze;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            zze = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zze = zze(j, j2, i);
        }
        this.zzf = zze;
    }

    private static long zze(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public final long zza() {
        return this.zzf;
    }

    public final boolean zzb() {
        return this.zzd != -1;
    }

    public final zzafw zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzafz zzafzVar = new zzafz(0L, this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j3 = this.zzc;
        long j4 = (((this.zze * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = this.zzb + Math.max(j4, 0L);
        long zzd = zzd(max);
        zzafz zzafzVar2 = new zzafz(zzd, max);
        if (j2 != -1 && zzd < j) {
            long j5 = max + j3;
            if (j5 < this.zza) {
                return new zzafw(zzafzVar2, new zzafz(zzd(j5), j5));
            }
        }
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    public final long zzd(long j) {
        return zze(j, this.zzb, this.zze);
    }
}
