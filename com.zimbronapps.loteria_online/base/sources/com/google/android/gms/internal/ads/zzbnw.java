package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbnw implements zzboh {
    static final /* synthetic */ zzbnw zza = new zzbnw();

    private /* synthetic */ zzbnw() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckx zzckxVar = (zzckx) obj;
        zzboh zzbohVar = zzbog.zza;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzjA)).booleanValue()) {
            int i = o0.b;
            W5.p.f("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            int i2 = o0.b;
            W5.p.f("Package name missing in canOpenApp GMSG.");
            return;
        }
        Map hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzckxVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + valueOf.toString().length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(valueOf);
        o0.k(sb.toString());
        ((zzbrd) zzckxVar).zze("openableApp", hashMap);
    }
}
