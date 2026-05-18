package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzip implements zzba {
    private static final ThreadLocal zza = new zzir();

    public static /* synthetic */ Cipher zza() {
        return zzb();
    }

    private static Cipher zzb() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
        }
    }

    public static zzba zza(zzdz zzdzVar) throws GeneralSecurityException {
        return zzgz.zza(zzdzVar, new zzis());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw new NoSuchMethodError();
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw new NoSuchMethodError();
    }
}
