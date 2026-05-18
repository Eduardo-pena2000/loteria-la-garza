package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaqo implements zzafy {
    private final zzaql zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqo(zzaql zzaqlVar, int i, long j, long j2) {
        this.zza = zzaqlVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzaqlVar.zzd;
        this.zzd = j3;
        this.zze = zzd(j3);
    }

    private final long zzd(long j) {
        return zzfj.zzt(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    public final long zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return true;
    }

    public final zzafw zzc(long j) {
        long j2 = this.zzb;
        zzaql zzaqlVar = this.zza;
        long j3 = (zzaqlVar.zzc * j) / (j2 * 1000000);
        String str = zzfj.zza;
        long j4 = this.zzd - 1;
        long max = Math.max(0L, Math.min(j3, j4));
        long j5 = zzaqlVar.zzd;
        long zzd = zzd(max);
        long j6 = this.zzc;
        zzafz zzafzVar = new zzafz(zzd, (max * j5) + j6);
        if (zzd >= j || max == j4) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j7 = max + 1;
        return new zzafw(zzafzVar, new zzafz(zzd(j7), j6 + (j5 * j7)));
    }
}
