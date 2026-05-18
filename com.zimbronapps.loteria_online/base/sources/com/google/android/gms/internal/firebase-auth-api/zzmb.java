package com.google.android.gms.internal.firebase-auth-api;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzmb {
    private static final byte[] zza = new byte[0];
    private final zzly zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    private zzmb(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzly zzlyVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzlyVar;
    }

    public static zzmb zza(byte[] bArr, zzme zzmeVar, zzmf zzmfVar, zzmc zzmcVar, zzly zzlyVar, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzmfVar.zza(bArr, zzmeVar);
        byte[] bArr3 = zzmk.zza;
        byte[] zza3 = zzmk.zza(zzmfVar.zza(), zzmcVar.zzb(), zzlyVar.zzc());
        byte[] bArr4 = zzmk.zzl;
        byte[] bArr5 = zza;
        byte[] zza4 = zzyz.zza(bArr3, zzmcVar.zza(bArr4, bArr5, "psk_id_hash", zza3), zzmcVar.zza(bArr4, bArr2, "info_hash", zza3));
        byte[] zza5 = zzmcVar.zza(zza2, bArr5, "secret", zza3);
        byte[] zza6 = zzmcVar.zza(zza5, zza4, "key", zza3, zzlyVar.zza());
        byte[] zza7 = zzmcVar.zza(zza5, zza4, "base_nonce", zza3, zzlyVar.zzb());
        zzlyVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzmb(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzlyVar);
    }

    private final synchronized byte[] zza() throws GeneralSecurityException {
        byte[] zza2;
        zza2 = zzyz.zza(this.zze, zzne.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) < 0) {
            this.zzf = this.zzf.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zza2;
    }

    public final byte[] zza(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zza(this.zzd, zza(), bArr, i, bArr2);
    }
}
