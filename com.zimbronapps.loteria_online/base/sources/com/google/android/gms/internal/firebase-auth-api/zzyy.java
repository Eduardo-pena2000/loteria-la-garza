package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyy implements zzba {
    private static final zziv.zza zza = zziv.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    private zzyy(byte[] bArr, zzaaj zzaajVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgr.zzb(bArr);
        this.zzc = zzaajVar.zzb();
    }

    public static zzba zza(zzds zzdsVar) throws GeneralSecurityException {
        if (((zzdx) ((zzcy) zzdsVar.zza())).zzb() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + ((zzdx) ((zzcy) zzdsVar.zza())).zzb());
        }
        if (((zzdx) ((zzcy) zzdsVar.zza())).zzd() == 16) {
            return new zzyy(zzdsVar.zzf().zza(zzbf.zza()), zzdsVar.zzd());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + ((zzdx) ((zzcy) zzdsVar.zza())).zzd());
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza2 = zzqd.zza(12);
        AlgorithmParameterSpec zza3 = zzgr.zza(zza2);
        Cipher zza4 = zzgr.zza();
        zza4.init(1, this.zzb, zza3);
        if (bArr2 != null && bArr2.length != 0) {
            zza4.updateAAD(bArr2);
        }
        int outputSize = zza4.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, 12);
        if (zza4.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + 12) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 28) {
                if (zzqn.zza(bArr3, bArr)) {
                    AlgorithmParameterSpec zza2 = zzgr.zza(bArr, this.zzc.length, 12);
                    Cipher zza3 = zzgr.zza();
                    zza3.init(2, this.zzb, zza2);
                    if (bArr2 != null && bArr2.length != 0) {
                        zza3.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.zzc;
                    return zza3.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
