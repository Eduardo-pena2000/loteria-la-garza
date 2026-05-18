package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbgq extends zzbgv {
    public zzbgq(int i, String str, Boolean bool, Boolean bool2) {
        super(i, str, bool, bool2, null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zze()))) : (Boolean) zzf();
    }

    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(zze(), ((Boolean) obj).booleanValue());
    }

    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zze(), ((Boolean) zzf()).booleanValue()));
    }

    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zze(), ((Boolean) zzf()).booleanValue()));
    }
}
