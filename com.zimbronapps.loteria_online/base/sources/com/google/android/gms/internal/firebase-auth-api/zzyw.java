package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyw implements zzba {
    private static final zziv.zza zza = zziv.zza.zza;
    private static final ThreadLocal zzb = new zzyv();
    private final byte[] zzc;
    private final zzsq zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    private zzyw(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i;
        zzaai.zza(bArr.length);
        this.zze = new SecretKeySpec(bArr, "AES");
        this.zzd = zzzz.zza(zzso.zza(zzsr.zza(bArr.length), zzaal.zza(bArr, zzbf.zza())));
        this.zzc = bArr2;
    }

    public static zzba zza(zzdl zzdlVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (((zzdq) ((zzcy) zzdlVar.zza())).zzd() == 16) {
            return new zzyw(zzdlVar.zzf().zza(zzbf.zza()), ((zzdq) ((zzcy) zzdlVar.zza())).zzb(), zzdlVar.zzd().zzb());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + ((zzdq) ((zzcy) zzdlVar.zza())).zzd());
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i = this.zzf;
        if (length > (length2 - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i + bArr.length + 16);
        byte[] zza2 = zzqd.zza(this.zzf);
        System.arraycopy(zza2, 0, copyOf, this.zzc.length, this.zzf);
        byte[] zza3 = zza(0, zza2, 0, zza2.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] zza4 = zza(1, bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) zzb.get();
        cipher.init(1, this.zze, new IvParameterSpec(zza3));
        cipher.doFinal(bArr, 0, bArr.length, copyOf, this.zzc.length + this.zzf);
        byte[] zza5 = zza(2, copyOf, this.zzc.length + this.zzf, bArr.length);
        int length3 = this.zzc.length + bArr.length + this.zzf;
        for (int i2 = 0; i2 < 16; i2++) {
            copyOf[length3 + i2] = (byte) ((zza4[i2] ^ zza3[i2]) ^ zza5[i2]);
        }
        return copyOf;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        int length2 = ((length - bArr3.length) - this.zzf) - 16;
        if (length2 >= 0) {
            if (zzqn.zza(bArr3, bArr)) {
                byte[] zza2 = zza(0, bArr, this.zzc.length, this.zzf);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] zza3 = zza(1, bArr2, 0, bArr2.length);
                byte[] zza4 = zza(2, bArr, this.zzc.length + this.zzf, length2);
                int length3 = bArr.length - 16;
                byte b = 0;
                for (int i = 0; i < 16; i++) {
                    b = (byte) (b | (((bArr[length3 + i] ^ zza3[i]) ^ zza2[i]) ^ zza4[i]));
                }
                if (b == 0) {
                    Cipher cipher = (Cipher) zzb.get();
                    cipher.init(1, this.zze, new IvParameterSpec(zza2));
                    return cipher.doFinal(bArr, this.zzc.length + this.zzf, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private final byte[] zza(int i, byte[] bArr, int i2, int i3) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.zzd.zza(bArr2, 16);
    }
}
