package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchd implements zzboh {
    private final zzchc zza;

    public zzchd(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i = o0.b;
            W5.p.f("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.zza.zza(str2);
            } else {
                int i2 = o0.b;
                W5.p.f("src missing from video GMSG.");
            }
        }
    }
}
