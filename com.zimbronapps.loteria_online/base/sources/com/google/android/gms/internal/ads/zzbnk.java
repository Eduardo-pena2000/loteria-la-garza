package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnk implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            String str = (String) map.get("enabled");
            zzboh zzbohVar = zzbog.zza;
            if (!zzgql.zze("true", str) && !zzgql.zze("false", str)) {
                return;
            }
            zzgai.zza(zzcjlVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e) {
            R5.t.l().zzg(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
