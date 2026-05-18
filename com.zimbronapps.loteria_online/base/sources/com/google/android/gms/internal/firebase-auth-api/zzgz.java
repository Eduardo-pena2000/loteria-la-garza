package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgz implements zzba {
    private static final byte[] zza = zzzx.zza("7a806c");
    private static final byte[] zzb = zzzx.zza("46bb91c3c5");
    private static final byte[] zzc = zzzx.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzzx.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzzx.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final zzhc zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzgz(byte[] bArr, byte[] bArr2, zzhc zzhcVar) throws GeneralSecurityException {
        this.zzh = bArr2;
        zzaai.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
        this.zzf = zzhcVar;
    }

    public static zzba zza(zzdz zzdzVar, zzhc zzhcVar) throws GeneralSecurityException {
        if (zza((Cipher) zzhcVar.zza())) {
            return new zzgz(zzdzVar.zzf().zza(zzbf.zza()), zzdzVar.zzd().zzb(), zzhcVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) this.zzf.zza();
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] zza2 = zzqd.zza(12);
        System.arraycopy(zza2, 0, copyOf, this.zzh.length, 12);
        cipher.init(1, this.zzg, zza(zza2, 0, zza2.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int doFinal = cipher.doFinal(bArr, 0, bArr.length, copyOf, this.zzh.length + 12);
        if (doFinal == bArr.length + 16) {
            return copyOf;
        }
        throw new GeneralSecurityException(String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i, int i2) {
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    public static boolean zza(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), zza(bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        if (length >= bArr3.length + 28) {
            if (zzqn.zza(bArr3, bArr)) {
                Cipher cipher = (Cipher) this.zzf.zza();
                cipher.init(2, this.zzg, zza(bArr, this.zzh.length, 12));
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                byte[] bArr4 = this.zzh;
                return cipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
