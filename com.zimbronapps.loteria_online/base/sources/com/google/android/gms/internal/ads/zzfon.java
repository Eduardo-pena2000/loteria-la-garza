package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfon {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) S5.D.c().zzd(zzbhe.zzke), str);
    }

    public static void zzb(x7.e eVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(eVar), new zzfoj(zzfoeVar), zzcei.zzg);
        }
    }

    public static zzfmu zzc(zzfoe zzfoeVar) {
        return new zzfom(zzfoeVar);
    }

    public static void zzd(x7.e eVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(eVar, zzfooVar, zzfoeVar, false);
    }

    public static void zze(x7.e eVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(eVar, zzfooVar, zzfoeVar, true);
    }

    public static void zzf(x7.e eVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(eVar), new zzfol(zzfooVar, zzfoeVar), zzcei.zzg);
        }
    }

    public static int zzg(zzfjk zzfjkVar) {
        int g = b6.c.g(zzfjkVar) - 1;
        return (g == 0 || g == 1) ? 7 : 23;
    }

    private static void zzh(x7.e eVar, zzfoo zzfooVar, zzfoe zzfoeVar, boolean z) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(eVar), new zzfok(zzfooVar, zzfoeVar, z), zzcei.zzg);
        }
    }
}
