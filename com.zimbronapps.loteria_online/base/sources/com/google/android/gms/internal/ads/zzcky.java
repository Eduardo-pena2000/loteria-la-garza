package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzcky extends zzcjw {
    public zzcky(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z, zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z, new zzbww(zzcjlVar, zzcjlVar.zzK(), new zzbgl(zzcjlVar.getContext())), null, zzejfVar);
    }

    public final WebResourceResponse zzac(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcjl)) {
            int i = o0.b;
            W5.p.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcjl zzcjlVar = (zzcjl) webView;
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zze(str, map, 1);
        }
        zzfxl.zza();
        zzfxq zzfxqVar = zzfxq.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzL(str, map);
        }
        if (zzcjlVar.zzP() != null) {
            zzcjlVar.zzP().zzN();
        }
        if (zzcjlVar.zzN().zzg()) {
            str2 = (String) S5.D.c().zzd(zzbhe.zzax);
        } else if (zzcjlVar.zzW()) {
            str2 = (String) S5.D.c().zzd(zzbhe.zzaw);
        } else {
            str2 = (String) S5.D.c().zzd(zzbhe.zzav);
        }
        R5.t.g();
        return F0.b(zzcjlVar.getContext(), zzcjlVar.zzs().a, str2);
    }
}
