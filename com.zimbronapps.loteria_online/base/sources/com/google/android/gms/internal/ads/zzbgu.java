package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbgu extends zzbgv {
    public zzbgu(int i, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(zze())) : (String) zzf();
    }

    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zze(), (String) obj);
    }

    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return jSONObject.optString(zze(), (String) zzf());
    }

    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zze(), (String) zzf());
    }
}
