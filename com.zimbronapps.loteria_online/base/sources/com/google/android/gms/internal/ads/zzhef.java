package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhef implements zzhas {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzhas zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzhef(zzhqf zzhqfVar, zzhas zzhasVar) throws GeneralSecurityException {
        if (zze.contains(zzhqfVar.zza())) {
            this.zzc = zzhqfVar.zza();
            zzhqe zzg = zzhqf.zzg(zzhqfVar);
            zzg.zzc(zzhqy.zzd);
            zzhbv.zzb(((zzhqf) zzg.zzbm()).zzaN());
            this.zzd = zzhasVar;
            return;
        }
        String zza2 = zzhqfVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 67);
        sb.append("Unsupported DEK key type: ");
        sb.append(zza2);
        sb.append(". Only Tink AEAD key types are supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzian zzianVar = zzian.zza;
            return ((zzhas) zzhkd.zza().zzd(zzhkg.zza().zzg(zzhlb.zza(str, zzian.zzs(zza2, 0, zza2.length), zzhqb.zzb, zzhqy.zzd, null), zzhax.zza()), zzhas.class)).zza(bArr4, bArr2);
        } catch (NegativeArraySizeException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
