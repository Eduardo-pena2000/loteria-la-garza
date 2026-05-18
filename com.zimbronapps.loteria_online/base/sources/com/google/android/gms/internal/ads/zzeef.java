package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeef implements zzgyw {
    private final /* synthetic */ String zza;

    public /* synthetic */ zzeef(zzeeg zzeegVar, String str) {
        this.zza = str;
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        String str = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        String str2 = this.zza;
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzgzo.zza(jSONObject);
        } catch (JSONException e) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
        }
    }
}
