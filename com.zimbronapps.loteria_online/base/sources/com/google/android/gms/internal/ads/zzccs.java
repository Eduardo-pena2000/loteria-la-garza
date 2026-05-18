package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccs {
    public static String zza(String str, Context context, boolean z, Map map) {
        String zzj;
        if ((((Boolean) S5.D.c().zzd(zzbhe.zzaX)).booleanValue() && !z) || !R5.t.d().zza(context) || TextUtils.isEmpty(str) || (zzj = R5.t.d().zzj(context)) == null) {
            return str;
        }
        String str2 = (String) S5.D.c().zzd(zzbhe.zzaQ);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaP)).booleanValue() && str.contains(str2)) {
            if (R5.t.g().V(str)) {
                R5.t.d().zzk(context, zzj, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, zzj);
            }
            if (!R5.t.g().W(str)) {
                return str;
            }
            R5.t.d().zzl(context, zzj, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, zzj);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaO)).booleanValue()) {
            return str;
        }
        if (R5.t.g().V(str)) {
            R5.t.d().zzk(context, zzj, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", zzj).toString();
        }
        if (!R5.t.g().W(str)) {
            return str;
        }
        R5.t.d().zzl(context, zzj, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", zzj).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!R5.t.d().zza(context)) {
            return uri.toString();
        }
        String zzj = R5.t.d().zzj(context);
        if (zzj == null) {
            return uri.toString();
        }
        String str = (String) S5.D.c().zzd(zzbhe.zzaQ);
        String uri2 = uri.toString();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaP)).booleanValue() && uri2.contains(str)) {
            R5.t.d().zzk(context, zzj, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzj);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzaO)).booleanValue()) {
            return uri2;
        }
        String uri3 = zzc(zzd(uri2, context), "fbs_aeid", zzj).toString();
        R5.t.d().zzk(context, zzj, (Map) map.get("_ac"));
        return uri3;
    }

    public static Uri zzc(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    private static String zzd(String str, Context context) {
        String zzh = R5.t.d().zzh(context);
        String zzi = R5.t.d().zzi(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzh)) {
            str = zzc(str, "gmp_app_id", zzh).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzi)) ? str : zzc(str, "fbs_aiid", zzi).toString();
    }
}
