package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqb {
    private static final ThreadLocal zza;

    static {
        zzph zzi = zzpj.zzi();
        zzi.zzf(-62135596800L);
        zzi.zze(0);
        zzph zzi2 = zzpj.zzi();
        zzi2.zzf(253402300799L);
        zzi2.zze(999999999);
        zzph zzi3 = zzpj.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
        zza = new zzqa();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpj zza(zzpj zzpjVar) {
        long zzg = zzpjVar.zzg();
        boolean zze = zze(zzg);
        int zzf = zzpjVar.zzf();
        if (!zze || zzf < 0 || zzf >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(zzg), Integer.valueOf(zzf)}));
        }
        return zzpjVar;
    }

    public static zzpj zzb(long j) {
        long j2 = j / 1000;
        if (!zze(j2)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[]{Long.valueOf(j2)}));
        }
        int i = (int) ((j % 1000) * 1000000);
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzkk.zza(j2, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j2 = zzkk.zzb(j2, 1L);
        }
        zzph zzi = zzpj.zzi();
        zzi.zzf(j2);
        zzi.zze(i);
        zzpj zzpjVar = (zzpj) zzi.zzi();
        zza(zzpjVar);
        return zzpjVar;
    }

    public static String zzc(zzpj zzpjVar) {
        zza(zzpjVar);
        long zzg = zzpjVar.zzg();
        int zzf = zzpjVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb.append(".");
            sb.append(zzf % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", new Object[]{Integer.valueOf(zzf / 1000000)}) : zzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", new Object[]{Integer.valueOf(zzf / 1000)}) : String.format(Locale.ENGLISH, "%1$09d", new Object[]{Integer.valueOf(zzf)}));
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, (Class[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
