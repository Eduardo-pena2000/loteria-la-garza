package com.google.android.gms.internal.firebase-auth-api;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zznh {
    private static final String[] zza = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider zza() {
        for (String str : zza) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static Provider zzb() {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalArgumentException | InvocationTargetException | IllegalAccessException unused) {
            return null;
        }
    }
}
