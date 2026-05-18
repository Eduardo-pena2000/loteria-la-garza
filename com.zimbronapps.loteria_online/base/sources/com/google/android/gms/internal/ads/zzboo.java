package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzboo implements zzboh {
    static final Map zza = E6.g.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final R5.b zzb;
    private final zzbwr zzc;
    private final zzbwy zzd;

    public zzboo(R5.b bVar, zzbwr zzbwrVar, zzbwy zzbwyVar) {
        this.zzb = bVar;
        this.zzc = zzbwrVar;
        this.zzd = zzbwyVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                R5.b bVar = this.zzb;
                if (!bVar.b()) {
                    bVar.c(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbwu(zzcjlVar, map).zza();
                    return;
                }
                if (intValue == 4) {
                    new zzbwo(zzcjlVar, map).zza();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
                        int i2 = o0.b;
                        W5.p.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcjlVar == null) {
            int i3 = o0.b;
            W5.p.f("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = parseBoolean ? -1 : 14;
        }
        zzcjlVar.zzam(i);
    }
}
