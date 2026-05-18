package com.google.android.gms.internal.fido;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzah {
    private static final Object zza = new Object();
    private static volatile boolean zzb = false;
    private static volatile zzag zzc = null;
    private static volatile boolean zzd = false;
    private static volatile zzag zze;

    public static void zza() {
        zzd = true;
    }

    public static void zzb() {
        if (zze == null) {
            zze = new zzag(null);
        }
    }

    public static void zzc() {
        if (zzc == null) {
            zzc = new zzag(null);
        }
    }

    public static boolean zzd() {
        synchronized (zza) {
        }
        return false;
    }
}
