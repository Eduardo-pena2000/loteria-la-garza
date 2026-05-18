package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhhh extends zzhhe {
    public zzhhh(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    public final int[] zza(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
        }
        int[] iArr2 = new int[16];
        zzhhc.zza(iArr2, zzhhc.zze(this.zza, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    public final int zzb() {
        return 24;
    }
}
