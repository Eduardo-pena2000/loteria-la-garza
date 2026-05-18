package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhvy implements zzhbr {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzhbs zzi;

    private zzhvy(RSAPrivateCrtKey rSAPrivateCrtKey, zzhtw zzhtwVar, byte[] bArr, byte[] bArr2, zzhbs zzhbsVar, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhtwVar != zzhtw.zza && zzhtwVar != zzhtw.zzb && zzhtwVar != zzhtw.zzc) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhtwVar)));
        }
        zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzhvz.zzc(zzhtwVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzhbsVar;
        this.zza = provider;
    }

    public static zzhbr zzb(zzhua zzhuaVar) throws GeneralSecurityException {
        Provider zzb2 = zzhvz.zzb();
        zzhvy zzhvyVar = new zzhvy((zzb2 != null ? KeyFactory.getInstance("RSA", zzb2) : (KeyFactory) zzhxe.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhuaVar.zze().zzd(), zzhuaVar.zzd().zzd(), zzhuaVar.zzi().zzb(zzhax.zza()), zzhuaVar.zzf().zzb(zzhax.zza()), zzhuaVar.zzh().zzb(zzhax.zza()), zzhuaVar.zzj().zzb(zzhax.zza()), zzhuaVar.zzk().zzb(zzhax.zza()), zzhuaVar.zzl().zzb(zzhax.zza()))), zzhuaVar.zzd().zzf(), zzhuaVar.zze().zze().zzc(), zzhuaVar.zzd().zze().equals(zzhtx.zzc) ? zzc : zzb, zzb2 != null ? zzhvz.zze(zzhuaVar.zze(), zzb2) : zzhxw.zzb(zzhuaVar.zze()), zzb2);
        zzhvyVar.zza(zzd);
        return zzhvyVar;
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Signature signature;
        Provider provider = this.zza;
        if (provider != null) {
            signature = Signature.getInstance(this.zzf, provider);
        } else {
            signature = (Signature) zzhxe.zzc.zzb(this.zzf);
        }
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            sign = zzhwr.zza(bArr3, sign);
        }
        try {
            this.zzi.zza(sign, bArr);
            return sign;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("RSA signature computation error", e);
        }
    }
}
