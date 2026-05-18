package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbof implements zzboh {
    static final /* synthetic */ zzbof zza = new zzbof();

    private /* synthetic */ zzbof() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckx zzckxVar = (zzckx) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i = o0.b;
            W5.p.f("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        Map hashMap = new HashMap();
        PackageManager packageManager = zzckxVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            Boolean valueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null);
            hashMap.put(str2, valueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + valueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(valueOf);
            o0.k(sb.toString());
        }
        ((zzbrd) zzckxVar).zze("openableURLs", hashMap);
    }
}
