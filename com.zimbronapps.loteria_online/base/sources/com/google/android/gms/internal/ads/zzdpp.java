package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdpp implements zzboh {
    private final /* synthetic */ zzdpu zza;

    public /* synthetic */ zzdpp(zzdpu zzdpuVar) {
        this.zza = zzdpuVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        zzcjlVar.zzP().zzG(new zzdps(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcjlVar.loadData(str, "text/html", "UTF-8");
        } else {
            zzcjlVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
