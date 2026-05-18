package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbgm implements zzgru {
    private final /* synthetic */ SharedPreferences zza;

    public /* synthetic */ zzbgm(SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    public final /* synthetic */ Object zza() {
        return this.zza.getString("flag_configuration", "{}");
    }
}
