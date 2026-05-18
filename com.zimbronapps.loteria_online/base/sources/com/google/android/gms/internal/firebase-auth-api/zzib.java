package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzib implements zzba {
    private final byte[] zza;
    private final int zzb;
    private final zzsq zzc;

    private zzib(byte[] bArr, zzaaj zzaajVar, int i) throws GeneralSecurityException {
        this.zzc = zzzz.zza(zzso.zza(zzsr.zza(bArr.length), zzaal.zza(bArr, zzbf.zza())));
        this.zza = zzaajVar.zzb();
        this.zzb = i;
    }

    public static zzba zza(zzfw zzfwVar) throws GeneralSecurityException {
        if (((zzfz) ((zzcy) zzfwVar.zza())).zzb() < 8 || ((zzfz) ((zzcy) zzfwVar.zza())).zzb() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new zzib(zzfwVar.zze().zza(zzbf.zza()), zzfwVar.zzd(), ((zzfz) ((zzcy) zzfwVar.zza())).zzb());
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza = zzqd.zza(this.zzb + 12);
        byte[] copyOf = Arrays.copyOf(zza, this.zzb);
        int i = this.zzb;
        byte[] copyOfRange = Arrays.copyOfRange(zza, i, i + 12);
        byte[] zzb = new zzhs(zza(copyOf)).zzb(copyOfRange, bArr, this.zza.length + this.zzb + copyOfRange.length, bArr2);
        byte[] bArr3 = this.zza;
        System.arraycopy(bArr3, 0, zzb, 0, bArr3.length);
        System.arraycopy(zza, 0, zzb, this.zza.length, zza.length);
        return zzb;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zza;
            if (length >= bArr3.length + this.zzb + 28) {
                if (zzqn.zza(bArr3, bArr)) {
                    int length2 = this.zza.length + this.zzb;
                    int i = length2 + 12;
                    return new zzhs(zza(Arrays.copyOfRange(bArr, this.zza.length, length2))).zza(Arrays.copyOfRange(bArr, length2, i), bArr, i, bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }

    private final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length <= 12 && bArr.length >= 8) {
            System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
            System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
            byte[] bArr4 = new byte[32];
            System.arraycopy(this.zzc.zza(bArr2, 16), 0, bArr4, 0, 16);
            System.arraycopy(this.zzc.zza(bArr3, 16), 0, bArr4, 16, 16);
            return bArr4;
        }
        throw new GeneralSecurityException("invalid salt size");
    }
}
