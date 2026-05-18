package com.google.android.gms.internal.firebase-auth-api;

import android.content.Context;
import v6.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaeu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int h = h.f().h(context, 12451000);
            zza = Boolean.valueOf(h == 0 || h == 2);
        }
        return zza.booleanValue();
    }
}
