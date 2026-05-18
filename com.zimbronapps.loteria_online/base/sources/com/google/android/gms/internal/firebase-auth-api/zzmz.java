package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzmz {
    public static zzba zza(String str) throws GeneralSecurityException {
        return new zznc(str, zza());
    }

    public static boolean zzb(String str) throws GeneralSecurityException {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load((KeyStore.LoadStoreParameter) null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
