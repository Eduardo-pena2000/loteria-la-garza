package com.google.android.gms.internal.firebase-auth-api;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzafc {
    private final int zza;

    private zzafc(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List zza = zzt.zza("[.-]").zza((CharSequence) str);
            if (zza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza.size() >= 3) {
                return (Integer.parseInt((String) zza.get(0)) * 1000000) + (Integer.parseInt((String) zza.get(1)) * 1000) + Integer.parseInt((String) zza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e}));
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", new Object[]{Integer.toString(this.zza)});
    }

    public static zzafc zza() {
        String b = p.a().b("firebase-auth");
        if (TextUtils.isEmpty(b) || b.equals("UNKNOWN")) {
            b = "-1";
        }
        return new zzafc(b);
    }
}
