package com.google.android.gms.internal.firebase-auth-api;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqn {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        int i = 0;
        while (i == 0) {
            byte[] zza2 = zzqd.zza(4);
            i = (zza2[3] & 255) | ((zza2[0] & 255) << 24) | ((zza2[1] & 255) << 16) | ((zza2[2] & 255) << 8);
        }
        return i;
    }

    public static final zzaaj zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzql("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return zzaaj.zza(bArr);
    }

    public static final zzaaj zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return zzaaj.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
