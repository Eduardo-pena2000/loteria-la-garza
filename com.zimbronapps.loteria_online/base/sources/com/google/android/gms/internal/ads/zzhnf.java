package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnf implements zzhlx {
    public zzhnf(zzhlp zzhlpVar) {
    }

    public static zzhlx zza(zzhlp zzhlpVar) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider zza = zzhih.zza();
        if (zza != null) {
            try {
                return zzhne.zza(zzhlpVar, zza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhnf(zzhlpVar);
    }
}
