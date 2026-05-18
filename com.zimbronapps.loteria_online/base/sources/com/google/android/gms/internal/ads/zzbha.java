package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbha implements zzgru {
    private final /* synthetic */ SharedPreferences zza;

    public /* synthetic */ zzbha(SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    public final /* synthetic */ Object zza() {
        return this.zza.getString("app_settings_json", "{}");
    }
}
