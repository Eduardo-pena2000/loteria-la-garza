package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyx implements zzbe {
    private static final zziv.zza zza = zziv.zza.zza;
    private static final Collection zzb = Arrays.asList(new Integer[]{64});
    private static final byte[] zzc = new byte[16];
    private static final ThreadLocal zzd = new zzza();
    private final zzsq zze;
    private final byte[] zzf;
    private final byte[] zzg;

    private zzyx(byte[] bArr, zzaaj zzaajVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (zzb.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.zze = zzzz.zza(zzso.zza(zzsr.zza(copyOfRange.length), zzaal.zza(copyOfRange, zzbf.zza())));
            this.zzg = zzaajVar.zzb();
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    public static zzbe zza(zzja zzjaVar) throws GeneralSecurityException {
        return new zzyx(zzjaVar.zzf().zza(zzbf.zza()), zzjaVar.zze());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length >= bArr3.length + 16) {
            if (zzqn.zza(bArr3, bArr)) {
                Cipher cipher = (Cipher) zzd.get();
                byte[] bArr4 = this.zzg;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
                byte[] bArr5 = (byte[]) copyOfRange.clone();
                bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
                bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
                cipher.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr5));
                int length2 = this.zzg.length + 16;
                int length3 = bArr.length - length2;
                byte[] doFinal = cipher.doFinal(bArr, length2, length3);
                if (length3 == 0 && doFinal == null && zzaaf.zza()) {
                    doFinal = new byte[0];
                }
                byte[][] bArr6 = {bArr2, doFinal};
                byte[] zza3 = this.zze.zza(zzc, 16);
                for (int i = 0; i <= 0; i++) {
                    byte[] bArr7 = bArr6[i];
                    if (bArr7 == null) {
                        bArr7 = new byte[0];
                    }
                    zza3 = zzyz.zza(zzsf.zzb(zza3), this.zze.zza(bArr7, 16));
                }
                byte[] bArr8 = bArr6[1];
                if (bArr8.length >= 16) {
                    if (bArr8.length >= zza3.length) {
                        int length4 = bArr8.length - zza3.length;
                        zza2 = Arrays.copyOf(bArr8, bArr8.length);
                        for (int i2 = 0; i2 < zza3.length; i2++) {
                            int i3 = length4 + i2;
                            zza2[i3] = (byte) (zza2[i3] ^ zza3[i2]);
                        }
                    } else {
                        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                    }
                } else {
                    zza2 = zzyz.zza(zzsf.zza(bArr8), zzsf.zzb(zza3));
                }
                if (MessageDigest.isEqual(copyOfRange, this.zze.zza(zza2, 16))) {
                    return doFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
