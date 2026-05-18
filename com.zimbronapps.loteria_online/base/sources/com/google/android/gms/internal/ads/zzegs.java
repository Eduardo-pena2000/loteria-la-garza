package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzegs implements zzbss {
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzegt zzegtVar = (zzegt) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkJ)).booleanValue()) {
            zzbzw zzbzwVar = zzegtVar.zzc;
            jSONObject2.put("ad_request_url", zzbzwVar.zze());
            jSONObject2.put("ad_request_post_body", zzbzwVar.zzd());
        }
        zzbzw zzbzwVar2 = zzegtVar.zzc;
        jSONObject2.put("base_url", zzbzwVar2.zzc());
        jSONObject2.put("signals", zzegtVar.zzb);
        zzegz zzegzVar = zzegtVar.zza;
        jSONObject3.put("body", zzegzVar.zzc);
        jSONObject3.put("headers", S5.B.a().t(zzegzVar.zzb));
        jSONObject3.put("response_code", zzegzVar.zza);
        jSONObject3.put("latency", zzegzVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbzwVar2.zzh());
        return jSONObject;
    }
}
