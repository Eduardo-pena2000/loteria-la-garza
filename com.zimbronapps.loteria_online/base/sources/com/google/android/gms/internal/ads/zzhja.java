package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhja {
    public static boolean zza(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(charAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(charAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static zzhyl zzb(String str) throws IOException {
        try {
            zzhzq zzhzqVar = new zzhzq(new StringReader(str));
            zzhzqVar.zza(zzhyq.zzb);
            return zzhiy.zzb(zzhzqVar);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhiz) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
