package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhvn implements zzhbr {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private zzhvn(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", new Object[]{32}));
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(zzhwr.zza(zza, bArr)));
    }

    public static zzhbr zzb(zzhsr zzhsrVar) throws GeneralSecurityException {
        Provider zza2 = zzhih.zza();
        if (zza2 != null) {
            return new zzhvn(zzhsrVar.zzf().zzc(zzhax.zza()), zzhsrVar.zze().zze().zzc(), zzhsrVar.zzd().zzc().equals(zzhsp.zzc) ? new byte[]{0} : new byte[0], zza2);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
