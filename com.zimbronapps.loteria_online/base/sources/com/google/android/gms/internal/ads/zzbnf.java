package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnf implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            o0.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgpp zzl = zzgpq.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzg(zzcjlVar.getWidth());
        zzl.zza(zzcjlVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zzh((String) map.get("enifd"));
        }
        try {
            R5.t.x().c(zzcjlVar, zzl.zzi());
        } catch (NullPointerException e) {
            R5.t.l().zzg(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            o0.k("Missing parameters for LMD Overlay show request");
        }
    }
}
