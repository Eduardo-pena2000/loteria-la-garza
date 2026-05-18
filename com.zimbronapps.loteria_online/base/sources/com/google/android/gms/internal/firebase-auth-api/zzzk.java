package com.google.android.gms.internal.firebase-auth-api;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzzk implements zzba {
    private final zzaaa zza;
    private final zzcc zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzzk(zzaaa zzaaaVar, zzcc zzccVar, int i, byte[] bArr) {
        this.zza = zzaaaVar;
        this.zzb = zzccVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzba zza(zzdd zzddVar) throws GeneralSecurityException {
        return new zzzk(new zzyu(zzddVar.zzf().zza(zzbf.zza()), ((zzdi) ((zzcy) zzddVar.zza())).zzd()), new zzaag(new zzaae("HMAC" + String.valueOf(((zzdi) ((zzcy) zzddVar.zza())).zzg()), new SecretKeySpec(zzddVar.zzg().zza(zzbf.zza()), "HMAC")), ((zzdi) ((zzcy) zzddVar.zza())).zze()), ((zzdi) ((zzcy) zzddVar.zza())).zze(), zzddVar.zzd().zzb());
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzyz.zza(this.zzd, zzb, this.zzb.zza(zzyz.zza(bArr2, zzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length >= i + bArr3.length) {
            if (zzqn.zza(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                this.zzb.zza(copyOfRange2, zzyz.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
                return this.zza.zza(copyOfRange);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
