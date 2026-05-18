package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzkd extends zzkm {
    public zzkd(zzkg zzkgVar, String str, Boolean bool, boolean z) {
        super(zzkgVar, str, bool, true, null);
    }

    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzjg.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjg.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.zzb;
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder(str2.length() + 28 + obj2.length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(obj2);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
