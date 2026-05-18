package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsh implements zzqw {
    private static final zziv.zza zza = zziv.zza.zza;

    private zzsh(zzqp zzqpVar) {
    }

    public static zzqw zza(zzqp zzqpVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza2 = zznh.zza();
        if (zza2 != null) {
            try {
                return zzse.zza(zzqpVar, zza2);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzsh(zzqpVar);
    }
}
