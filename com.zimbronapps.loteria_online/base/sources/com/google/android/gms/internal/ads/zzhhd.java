package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhhd extends zzhhe {
    public zzhhd(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    public final int[] zza(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
        }
        int[] iArr2 = new int[16];
        zzhhc.zza(iArr2, this.zza);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    public final int zzb() {
        return 12;
    }
}
