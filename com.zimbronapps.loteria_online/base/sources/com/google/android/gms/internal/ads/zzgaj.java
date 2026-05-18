package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgaj {
    private static zzgaj zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzgaj(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzgaj zza(Context context) {
        if (zza == null) {
            zza = new zzgaj(context);
        }
        return zza;
    }

    public final void zzb(String str, Object obj) throws IOException {
        boolean commit;
        if (obj instanceof String) {
            commit = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String valueOf = String.valueOf(obj.getClass());
                String str2 = this.zzb;
                StringBuilder sb = new StringBuilder(valueOf.length() + 33 + String.valueOf(str2).length());
                sb.append("Unexpected object class ");
                sb.append(valueOf);
                sb.append(" for app ");
                sb.append(str2);
                Log.e("GpidLifecycleSPHandler", sb.toString());
                String str3 = this.zzb;
                StringBuilder sb2 = new StringBuilder(str.length() + 25 + String.valueOf(str3).length());
                sb2.append("Failed to store ");
                sb2.append(str);
                sb2.append(" for app ");
                sb2.append(str3);
                throw new IOException(sb2.toString());
            }
            commit = this.zzc.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        String str32 = this.zzb;
        StringBuilder sb22 = new StringBuilder(str.length() + 25 + String.valueOf(str32).length());
        sb22.append("Failed to store ");
        sb22.append(str);
        sb22.append(" for app ");
        sb22.append(str32);
        throw new IOException(sb22.toString());
    }

    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, (String) null);
    }

    public final long zzd(String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    public final boolean zze(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    public final void zzf(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(str2).length());
        sb.append("Failed to remove ");
        sb.append(str);
        sb.append(" for app ");
        sb.append(str2);
        throw new IOException(sb.toString());
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
