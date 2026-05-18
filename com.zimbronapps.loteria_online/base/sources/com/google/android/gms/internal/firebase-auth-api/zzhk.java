package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzhk extends ThreadLocal {
    private static Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzzj.zza.zza("ChaCha20-Poly1305");
            if (zzhh.zza(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final /* synthetic */ Object initialValue() {
        return zza();
    }
}
