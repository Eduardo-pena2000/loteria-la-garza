package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfg {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfg(long j) {
        zzd(0L);
    }

    public static long zzi(long j) {
        return zzfj.zzt(j, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j) {
        return zzfj.zzt(j, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j = this.zza;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zzb() {
        long j;
        try {
            j = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.zzc;
            if (j2 != -9223372036854775807L) {
                long zzj = zzj(j2);
                long j3 = (4294967296L + zzj) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - zzj) < Math.abs(j - zzj)) {
                    j = j4;
                }
            }
            return zzg(zzi(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzf(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.zzc;
            if (j2 != -9223372036854775807L) {
                long zzj = zzj(j2);
                long j3 = zzj / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= zzj) {
                    j = j4;
                }
            }
            return zzg(zzi(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzg(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzh()) {
                long j2 = this.zza;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.zzd.get();
                    if (l == null) {
                        throw null;
                    }
                    j2 = l.longValue();
                }
                this.zzb = j2 - j;
                notifyAll();
            }
            this.zzc = j;
            return j + this.zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != -9223372036854775807L;
    }
}
