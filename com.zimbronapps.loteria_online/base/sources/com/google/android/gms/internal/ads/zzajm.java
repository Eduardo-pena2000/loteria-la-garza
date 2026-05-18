package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzajm implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajm(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfj.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzajm zzd(long j, zzaiq zzaiqVar, long j2) {
        int length = zzaiqVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzaiqVar.zzb + r0[i3];
            j3 += zzaiqVar.zzc + zzaiqVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzajm(jArr, jArr2, j2);
    }

    private static Pair zzh(long j, long[] jArr, long[] jArr2) {
        int zzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[zzm];
        long j3 = jArr2[zzm];
        int i = zzm + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    public final long zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        return true;
    }

    public final zzafw zzc(long j) {
        String str = zzfj.zza;
        Pair zzh = zzh(zzfj.zzp(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzafz zzafzVar = new zzafz(zzfj.zzq(((Long) zzh.first).longValue()), ((Long) zzh.second).longValue());
        return new zzafw(zzafzVar, zzafzVar);
    }

    public final long zze(long j) {
        return zzfj.zzq(((Long) zzh(j, this.zza, this.zzb).second).longValue());
    }

    public final long zzf() {
        return -1L;
    }

    public final int zzg() {
        return -2147483647;
    }
}
