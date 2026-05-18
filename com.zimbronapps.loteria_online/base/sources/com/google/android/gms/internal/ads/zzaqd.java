package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaqd {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzer zzerVar, int i, int i2) {
        zzerVar.zzh(i);
        if (zzerVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int zzB = zzerVar.zzB();
        if ((8388608 & zzB) != 0 || ((zzB >> 8) & 8191) != i2 || (zzB & 32) == 0 || zzerVar.zzs() < 7 || zzerVar.zzd() < 7 || (zzerVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzerVar.zzm(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
