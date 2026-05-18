package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnc implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzc;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzar = zzcjlVar.zzar();
        if (zzar == null || (zzc = zzar.zzc()) == null) {
            zzcjlVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeAdViewSignalsReady", zzc);
        }
    }
}
