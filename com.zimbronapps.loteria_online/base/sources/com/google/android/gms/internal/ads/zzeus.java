package com.google.android.gms.internal.ads;

import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeus implements zzfav {
    private final Integer zza;

    private zzeus(Integer num) {
        this.zza = num;
    }

    public static /* synthetic */ zzeus zzc(W5.a aVar) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzly)).booleanValue()) {
            return new zzeus(null);
        }
        R5.t.g();
        int i = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30 || h.e.a(30) <= 3) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzlB)).booleanValue()) {
                    if (aVar.c >= ((Integer) S5.D.c().zzd(zzbhe.zzlA)).intValue() && i2 >= 31 && h.e.a(31) >= 9) {
                        i = h.e.a(31);
                    }
                }
            } else {
                i = h.e.a(1000000);
            }
        } catch (Exception e) {
            R5.t.l().zzg(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzeus(Integer.valueOf(i));
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (num != null) {
            zzdahVar.zza.putInt("aos", num.intValue());
        }
    }
}
