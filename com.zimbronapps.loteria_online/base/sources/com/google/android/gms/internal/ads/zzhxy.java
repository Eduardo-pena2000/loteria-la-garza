package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhxy implements zzhbr {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static zzhbr zzb(zzhum zzhumVar) throws GeneralSecurityException {
        try {
            return zzhwh.zzb(zzhumVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey generatePrivate = ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhumVar.zze().zzd(), zzhumVar.zzd().zzd(), zzhumVar.zzi().zzb(zzhax.zza()), zzhumVar.zzf().zzb(zzhax.zza()), zzhumVar.zzh().zzb(zzhax.zza()), zzhumVar.zzj().zzb(zzhax.zza()), zzhumVar.zzk().zzb(zzhax.zza()), zzhumVar.zzl().zzb(zzhax.zza())));
            zzhuk zzd = zzhumVar.zzd();
            zzhiu zzhiuVar = zzhya.zza;
            return new zzhxx(generatePrivate, (zzhxn) zzhiuVar.zzb(zzd.zzf()), (zzhxn) zzhiuVar.zzb(zzd.zzg()), zzd.zzh(), zzhumVar.zze().zze().zzc(), zzhumVar.zzd().zze().equals(zzhuj.zzc) ? zzb : zza, null);
        }
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
