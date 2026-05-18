package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpa implements zzboh {
    private final zzboz zza;

    public zzbpa(zzboz zzbozVar) {
        this.zza = zzbozVar;
    }

    public static void zzb(zzcjl zzcjlVar, zzboz zzbozVar) {
        zzcjlVar.zzab("/reward", new zzbpa(zzbozVar));
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcas zzcasVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcasVar = new zzcas(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            int i = o0.b;
            W5.p.g("Unable to parse reward amount.", e);
        }
        this.zza.zzb(zzcasVar);
    }
}
