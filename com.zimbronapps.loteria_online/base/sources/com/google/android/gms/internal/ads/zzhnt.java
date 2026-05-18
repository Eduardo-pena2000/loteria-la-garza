package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnt implements zzhnp {
    private static final ThreadLocal zzd = new zzhns();
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhnt(byte[] bArr) throws GeneralSecurityException {
        zzhyc.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzc = zzc();
        zzc.init(1, secretKeySpec);
        byte[] zza = zzhnd.zza(zzc.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzhnd.zza(zza);
    }

    public static zzhnp zzb(zzhnn zzhnnVar) throws GeneralSecurityException {
        return new zzhnt(zzhnnVar.zzd().zzc(zzhax.zza()));
    }

    private static Cipher zzc() throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            return (Cipher) zzd.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzd(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] zzb;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher zzc = zzc();
        zzc.init(1, secretKey);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        if (i2 * 16 == length) {
            zzb = zzhwr.zzb(bArr, i4, this.zzb, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.zzc;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            zzb = zzhwr.zzb(copyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            zzd(bArr3, bArr, i5 * 16, bArr4);
            if (zzc.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zzd(bArr3, zzb, 0, bArr4);
        if (zzc.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i == 16 ? bArr3 : Arrays.copyOf(bArr3, i);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
