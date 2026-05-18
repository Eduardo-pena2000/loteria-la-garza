package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaju implements zzajr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaju(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzaju zzd(zzajt zzajtVar, long j) {
        long zzb = zzajtVar.zzb();
        if (zzb == -9223372036854775807L) {
            return null;
        }
        zzafr zzafrVar = zzajtVar.zza;
        return new zzaju(j, zzafrVar.zzc, zzb, zzafrVar.zzf, zzajtVar.zzc, zzajtVar.zzf);
    }

    private final long zzh(int i) {
        return (this.zzc * i) / 100;
    }

    public final long zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        return this.zzg != null;
    }

    public final zzafw zzc(long j) {
        if (!zzb()) {
            zzafz zzafzVar = new zzafz(0L, this.zza + this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j2 = this.zzc;
        String str = zzfj.zza;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j3 = this.zze;
        zzafz zzafzVar2 = new zzafz(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    public final long zze(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.zze;
        int zzm = zzfj.zzm(jArr, (long) d, true, true);
        long zzh = zzh(zzm);
        long j3 = jArr[zzm];
        int i = zzm + 1;
        long zzh2 = zzh(i);
        return zzh + Math.round((j3 == (zzm == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (zzh2 - zzh));
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzd;
    }
}
