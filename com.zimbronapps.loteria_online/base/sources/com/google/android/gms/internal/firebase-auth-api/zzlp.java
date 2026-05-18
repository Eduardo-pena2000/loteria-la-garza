package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdx;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlp implements zzlr {
    private final int zza;

    public zzlp(zzdx zzdxVar) throws GeneralSecurityException {
        if (zzdxVar.zzb() != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzdxVar.zzd() != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzdxVar.zzf() != zzdx.zza.zzc) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.zza = zzdxVar.zzc();
    }

    public final int zza() {
        return this.zza;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey zzb = zzgr.zzb(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zza = zzgr.zza(bArr2, i, 12);
        Cipher zza2 = zzgr.zza();
        zza2.init(2, zzb, zza);
        return zza2.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }
}
