package com.google.android.gms.internal.firebase-auth-api;

import E6.c;
import com.google.android.gms.common.internal.t;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        t.f(str);
        List zza = zzt.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzahw.zza(new String(c.b((String) zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to decode token", e);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
