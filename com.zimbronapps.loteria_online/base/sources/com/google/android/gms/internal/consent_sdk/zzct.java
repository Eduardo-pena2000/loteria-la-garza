package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzct {
    private static String zza;

    public static synchronized String zza(Context context) {
        String str;
        synchronized (zzct.class) {
            try {
                if (zza == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                    if (string == null || zzdb.zza(true)) {
                        string = "emulator";
                    }
                    zza = zzb(string);
                }
                str = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static String zzb(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new Object[]{new BigInteger(1, messageDigest.digest())});
            } catch (NoSuchAlgorithmException unused) {
            } catch (ArithmeticException unused2) {
                return "";
            }
        }
        return "";
    }
}
