package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbod implements zzboh {
    static final /* synthetic */ zzbod zza = new zzbod();

    private /* synthetic */ zzbod() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcle zzcleVar = (zzcle) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzazh zzS = zzcleVar.zzS();
            if (zzS != null) {
                zzS.zzb().zze(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            int i = o0.b;
            W5.p.f("Could not parse touch parameters from gmsg.");
        }
    }
}
