package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgx {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e) {
            W5.p.g("", e);
            return null;
        }
    }

    public static final SharedPreferences zzb(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            W5.p.g("", e);
            return null;
        }
    }
}
