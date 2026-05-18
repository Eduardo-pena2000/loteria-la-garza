package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzboj implements zzboh {
    private final zzbok zza;

    public zzboj(zzbok zzbokVar) {
        this.zza = zzbokVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = o0.b;
            W5.p.d("Fail to parse float", e);
        }
        zzbok zzbokVar = this.zza;
        zzbokVar.zza(equals);
        zzbokVar.zzb(equals2, f);
        zzcjlVar.zzaE(equals);
    }
}
