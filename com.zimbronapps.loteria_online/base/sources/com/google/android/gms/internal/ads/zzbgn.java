package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbgn implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object zza = new Object();
    private SharedPreferences zzb = null;
    private JSONObject zzc = new JSONObject();

    private final void zzg(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new JSONObject((String) zzbhg.zza(new zzbgm(sharedPreferences)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            try {
                if (this.zzb != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                S5.D.a();
                SharedPreferences zza = zzbgx.zza(context);
                this.zzb = zza;
                zzg(zza);
                if (!((Boolean) zzbje.zzb.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzb(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(String str, long j) {
        return !str.startsWith("adapter:") ? j : this.zzc.optLong(str, j);
    }

    public final int zzd(String str, int i) {
        return !str.startsWith("adapter:") ? i : this.zzc.optInt(str, i);
    }

    public final float zze(String str, float f) {
        return !str.startsWith("adapter:") ? f : (float) this.zzc.optDouble(str, f);
    }

    public final boolean zzf(String str, boolean z) {
        return !str.startsWith("adapter:") ? z : this.zzc.optBoolean(str, z);
    }
}
