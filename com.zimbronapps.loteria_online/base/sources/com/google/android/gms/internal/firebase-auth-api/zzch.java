package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzch {
    private static final zzch zza = new zzch();

    private zzch() {
    }

    public static zzch zza() {
        return zza;
    }

    public static zzch zza(zzch zzchVar) throws GeneralSecurityException {
        if (zzchVar != null) {
            return zzchVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
