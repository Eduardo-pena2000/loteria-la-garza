package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqd {
    private static final ThreadLocal zza = new zzqg();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzb = zzb();
        zzb.nextLong();
        return zzb;
    }

    private static SecureRandom zzb() {
        Provider zza2 = zznh.zza();
        if (zza2 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zza2);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider zzb = zznh.zzb();
        if (zzb != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zzb);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
