package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdrw implements zzbde {
    private final /* synthetic */ zzcjl zza;

    public /* synthetic */ zzdrw(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final /* synthetic */ void zzdj(zzbdd zzbddVar) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", true != zzbddVar.zzj ? "0" : "1");
        this.zza.zze("onAdVisibilityChanged", hashMap);
    }
}
