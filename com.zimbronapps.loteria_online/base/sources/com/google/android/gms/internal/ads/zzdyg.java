package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdyg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final /* synthetic */ zzdyi zza;
    private final /* synthetic */ String zzb;

    public /* synthetic */ zzdyg(zzdyi zzdyiVar, String str) {
        this.zza = zzdyiVar;
        this.zzb = str;
    }

    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zzh(this.zzb, sharedPreferences, str);
    }
}
