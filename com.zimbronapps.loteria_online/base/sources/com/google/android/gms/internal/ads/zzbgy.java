package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbgy implements zzbju {
    final /* synthetic */ SharedPreferences zza;

    public zzbgy(zzbhc zzbhcVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbhcVar);
    }

    public final Boolean zza(String str, boolean z) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z)));
        }
    }

    public final Long zzb(String str, long j) {
        try {
            return Long.valueOf(this.zza.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    public final Double zzc(String str, double d) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d)));
        }
    }

    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
