package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmy implements zzboh {
    private final zzbmz zza;

    public zzbmy(zzbmz zzbmzVar) {
        this.zza = zzbmzVar;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i = o0.b;
            W5.p.f("App event with no name parameter.");
        }
    }
}
