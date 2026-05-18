package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhwn implements zzhas {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzhwn(byte[] bArr, zzhye zzhyeVar) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzhgj.zzb(bArr);
        this.zzb = zzhyeVar.zzc();
    }

    public static zzhas zzb(zzhdf zzhdfVar) throws GeneralSecurityException {
        zzhdfVar.zzf();
        zzhdfVar.zzf();
        return new zzhwn(zzhdfVar.zze().zzc(zzhax.zza()), zzhdfVar.zzc());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec zzc = zzhgj.zzc(bArr, length2, 12);
        SecretKey secretKey = this.zza;
        Cipher zza = zzhgj.zza();
        zza.init(2, secretKey, zzc);
        if (bArr2 != null && bArr2.length != 0) {
            zza.updateAAD(bArr2);
        }
        return zza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
