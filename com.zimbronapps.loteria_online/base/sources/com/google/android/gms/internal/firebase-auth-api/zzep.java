package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzep implements zzba {
    private static final byte[] zza = new byte[0];
    private static final Set zzb;
    private final String zzc;
    private final zzcb zzd;
    private final zzba zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    private zzep(zzxb zzxbVar, zzba zzbaVar) throws GeneralSecurityException {
        if (zzb.contains(zzxbVar.zzf())) {
            this.zzc = zzxbVar.zzf();
            this.zzd = zzcj.zza(((zzxb) ((zzalf) zzxb.zza(zzxbVar).zza(zzxz.RAW).zze())).zzk());
            this.zze = zzbaVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + zzxbVar.zzf() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static zzba zza(zzcy zzcyVar, zzba zzbaVar) throws GeneralSecurityException {
        try {
            return new zzep(zzxb.zza(zzcj.zza(zzcyVar), zzaku.zza()), zzbaVar);
        } catch (zzall e) {
            throw new GeneralSecurityException(e);
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbi zza2 = zzop.zza().zza(this.zzd, (Integer) null);
        byte[] zzb2 = this.zze.zzb(((zzqb) zzoz.zza().zza(zza2, zzqb.class, zzbf.zza())).zzd().zzd(), zza);
        if (zzb2.length > 4096) {
            throw new GeneralSecurityException("length of encrypted DEK too large");
        }
        byte[] zzb3 = ((zzba) zzpa.zza().zza(zza2, zzba.class)).zzb(bArr, bArr2);
        return ByteBuffer.allocate(zzb2.length + 4 + zzb3.length).putInt(zzb2.length).put(zzb2).put(zzb3).array();
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= 4096 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((zzba) zzpa.zza().zza(zzoz.zza().zza(zzqb.zza(this.zzc, zzajv.zza(this.zze.zza(bArr3, zza)), zzwx.zzb.SYMMETRIC, zzxz.RAW, null), zzbf.zza()), zzba.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (BufferUnderflowException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
