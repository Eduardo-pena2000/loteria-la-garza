package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlk implements zzly {
    public final int zza() {
        return 32;
    }

    public final int zzb() {
        return 12;
    }

    public final byte[] zzc() {
        return zzmk.zzk;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (zzhv.zza()) {
            return zzhv.zza(bArr).zza(bArr2, bArr3, i, bArr4);
        }
        return new zzht(bArr).zza(bArr2, Arrays.copyOfRange(bArr3, i, bArr3.length), bArr4);
    }
}
