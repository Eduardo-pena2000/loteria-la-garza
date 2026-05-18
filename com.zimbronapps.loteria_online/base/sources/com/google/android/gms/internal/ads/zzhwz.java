package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhwz implements zzhas {
    private final zzhxp zza;
    private final zzhbo zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzhwz(zzhxp zzhxpVar, zzhbo zzhboVar, int i, byte[] bArr) {
        this.zza = zzhxpVar;
        this.zzb = zzhboVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzhas zzb(zzhcn zzhcnVar) throws GeneralSecurityException {
        zzhwk zzhwkVar = new zzhwk(zzhcnVar.zze().zzc(zzhax.zza()), zzhcnVar.zzg().zzf());
        String valueOf = String.valueOf(zzhcnVar.zzg().zzh());
        return new zzhwz(zzhwkVar, new zzhxu(new zzhxt("HMAC".concat(valueOf), new SecretKeySpec(zzhcnVar.zzf().zzc(zzhax.zza()), "HMAC")), zzhcnVar.zzg().zze()), zzhcnVar.zzg().zze(), zzhcnVar.zzc().zzc());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzhxu) this.zzb).zzc(zzhwr.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
