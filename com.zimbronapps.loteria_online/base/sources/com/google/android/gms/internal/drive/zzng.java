package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzng {
    private static void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static /* synthetic */ void zzb(byte b, char[] cArr, int i) {
        zza(b, cArr, i);
    }

    private static boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b < -32;
    }

    private static boolean zzf(byte b) {
        return b < -16;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }

    public static /* synthetic */ boolean zzh(byte b) {
        return zzd(b);
    }

    public static /* synthetic */ boolean zzi(byte b) {
        return zze(b);
    }

    public static /* synthetic */ boolean zzj(byte b) {
        return zzf(b);
    }

    private static void zza(byte b, byte b2, char[] cArr, int i) throws zzkq {
        if (b < -62 || zzg(b2)) {
            throw zzkq.zzdn();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static /* synthetic */ void zzb(byte b, byte b2, char[] cArr, int i) throws zzkq {
        zza(b, b2, cArr, i);
    }

    public static /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkq {
        zza(b, b2, b3, cArr, i);
    }

    public static /* synthetic */ void zzb(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkq {
        zza(b, b2, b3, b4, cArr, i);
    }

    private static void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkq {
        if (!zzg(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !zzg(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw zzkq.zzdn();
    }

    private static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkq {
        if (!zzg(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !zzg(b3) && !zzg(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzkq.zzdn();
    }
}
