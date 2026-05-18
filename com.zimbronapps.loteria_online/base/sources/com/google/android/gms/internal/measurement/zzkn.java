package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final /* synthetic */ class zzkn implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final /* synthetic */ zzko zza;

    public /* synthetic */ zzkn(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zzc(sharedPreferences, str);
    }
}
