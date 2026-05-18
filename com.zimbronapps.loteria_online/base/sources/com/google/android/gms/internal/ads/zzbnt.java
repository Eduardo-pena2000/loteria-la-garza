package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnt implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcjlVar.zzdk();
        } else if ("resume".equals(str)) {
            zzcjlVar.zzdl();
        }
    }
}
