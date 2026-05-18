package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhxx implements zzhbr {
    public /* synthetic */ zzhxx(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhie.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zzb(zzhxnVar);
        if (!zzhxnVar.equals(zzhxnVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
        ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
