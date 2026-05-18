package com.google.android.gms.internal.firebase-auth-api;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaah {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = b;
        copyOf[31] = (byte) (b | 64);
        zzng.zza(jArr, copyOf, bArr2);
        return zznm.zzc(jArr);
    }

    public static byte[] zza() {
        byte[] zza = zzqd.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b = (byte) (zza[31] & 63);
        zza[31] = b;
        zza[31] = (byte) (b | 128);
        return zza;
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
