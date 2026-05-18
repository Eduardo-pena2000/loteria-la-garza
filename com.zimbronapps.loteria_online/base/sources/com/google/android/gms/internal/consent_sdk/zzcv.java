package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcv {
    private static final zzdw zza = zzdw.zzk("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    private final Context zzc;
    private final Map zzb = new HashMap();
    private final Map zzd = new HashMap();

    public zzcv(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ SharedPreferences.Editor zza(zzcv zzcvVar, String str) {
        return zzcvVar.zzf(str);
    }

    private final SharedPreferences.Editor zzf(String str) {
        Map map = this.zzd;
        if (!map.containsKey(str)) {
            map.put(str, this.zzc.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) map.get(str);
    }

    public final Map zzb() {
        return this.zzb;
    }

    public final void zzc() {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
    }

    public final void zzd() {
        this.zzb.clear();
    }

    public final boolean zze(String str, Object obj) {
        zzcu zza2 = zzcw.zza(this.zzc, str);
        if (zza2 == null) {
            return false;
        }
        SharedPreferences.Editor zzf = zzf(zza2.zza);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            String str2 = zza2.zzb;
            zzf.putInt(str2, num.intValue());
            if (!zza.contains(str2)) {
                return true;
            }
            this.zzb.put(str2, num);
            return true;
        }
        if (obj instanceof Long) {
            zzf.putLong(zza2.zzb, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            zzf.putFloat(zza2.zzb, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            zzf.putFloat(zza2.zzb, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            zzf.putBoolean(zza2.zzb, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        zzf.putString(zza2.zzb, (String) obj);
        return true;
    }
}
