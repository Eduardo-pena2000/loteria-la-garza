package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhxw implements zzhbs {
    static final zzhiu zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhit zza2 = zzhiu.zza();
        zza2.zza(zzhxn.SHA256, zzhtw.zza);
        zza2.zza(zzhxn.SHA384, zzhtw.zzb);
        zza2.zza(zzhxn.SHA512, zzhtw.zzc);
        zza = zza2.zzb();
    }

    public static zzhbs zzb(zzhuc zzhucVar) throws GeneralSecurityException {
        try {
            return zzhvz.zzd(zzhucVar);
        } catch (NoSuchProviderException unused) {
            return new zzhxv(((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhucVar.zzd(), zzhucVar.zzf().zzd())), (zzhxn) zza.zzb(zzhucVar.zzf().zzf()), zzhucVar.zze().zzc(), zzhucVar.zzf().zze().equals(zzhtx.zzc) ? zzc : zzb, null);
        }
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
