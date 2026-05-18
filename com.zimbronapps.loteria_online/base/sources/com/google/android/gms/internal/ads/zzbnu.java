package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnu implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (map.containsKey("start")) {
            zzcjlVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzcjlVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzcjlVar.zzP().zzt();
        }
    }
}
