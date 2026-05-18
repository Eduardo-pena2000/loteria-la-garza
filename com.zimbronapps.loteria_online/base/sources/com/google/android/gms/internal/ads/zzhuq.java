package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzhuq implements zzhjb {
    static final /* synthetic */ zzhuq zza = new zzhuq();

    private /* synthetic */ zzhuq() {
    }

    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhuk zzhukVar = (zzhuk) zzhbpVar;
        int i = zzhus.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhukVar.zzc(), new BigInteger(1, zzhukVar.zzd().toByteArray())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = generateKeyPair.getPrivate();
        zzhun zzhunVar = new zzhun(null);
        zzhunVar.zza(zzhukVar);
        zzhunVar.zzb(rSAPublicKey.getModulus());
        zzhunVar.zzc(num);
        zzhuo zzd = zzhunVar.zzd();
        zzhul zzhulVar = new zzhul(null);
        zzhulVar.zza(zzd);
        zzhulVar.zzb(zzhyf.zza(rSAPrivateCrtKey.getPrimeP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeQ(), zzhax.zza()));
        zzhulVar.zzc(zzhyf.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhax.zza()));
        zzhulVar.zzd(zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhax.zza()), zzhyf.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhax.zza()));
        zzhulVar.zze(zzhyf.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhax.zza()));
        return zzhulVar.zzf();
    }
}
