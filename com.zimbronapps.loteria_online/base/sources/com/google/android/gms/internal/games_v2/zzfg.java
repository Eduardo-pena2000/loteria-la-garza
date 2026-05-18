package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfg {
    private static final k zza = new k("Games");

    public static void zza(String str, String str2) {
        zza.b(zzi(str), str2);
    }

    public static void zzb(String str, String str2, Throwable th) {
        zza.c(zzi("GamesApiManager"), "Authentication task failed", th);
    }

    public static void zzc(String str, String str2) {
        zza.d(zzi(str), str2);
    }

    public static void zzd(String str, String str2, Throwable th) {
        zza.e(zzi(str), str2, th);
    }

    public static void zze(String str, String str2, Throwable th) {
        zza.g(zzi("SnapshotContentsEntity"), "Failed to write snapshot data", th);
    }

    public static void zzf(String str, String str2) {
        zza.h(zzi(str), str2);
    }

    public static void zzg(String str, String str2) {
        zza.i(zzi(str), str2);
    }

    public static void zzh(String str, String str2, Throwable th) {
        zza.j(zzi(str), str2, th);
    }

    private static String zzi(String str) {
        return String.format("%s[%s]", new Object[]{"PlayGamesServices", str});
    }
}
