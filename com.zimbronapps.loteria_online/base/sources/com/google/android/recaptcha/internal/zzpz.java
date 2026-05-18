package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzpz {
    static {
        zzmj zzi = zzml.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzmj zzi2 = zzml.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzmj zzi3 = zzml.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
    }

    public static zzml zza(long j) {
        int i = (int) (j % 1000000000);
        long j2 = j / 1000000000;
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzkk.zza(j2, i / 1000000000);
            i %= 1000000000;
        }
        if (j2 > 0 && i < 0) {
            i += 1000000000;
            j2--;
        }
        if (j2 < 0 && i > 0) {
            i -= 1000000000;
            j2++;
        }
        zzmj zzi = zzml.zzi();
        zzi.zzf(j2);
        zzi.zze(i);
        zzml zzmlVar = (zzml) zzi.zzi();
        long zzg = zzmlVar.zzg();
        int zzf = zzmlVar.zzf();
        if (zzg < -315576000000L || zzg > 315576000000L || zzf < -999999999 || zzf >= 1000000000 || ((zzg < 0 || zzf < 0) && (zzg > 0 || zzf > 0))) {
            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
        }
        return zzmlVar;
    }
}
