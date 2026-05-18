package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzbre extends zzbrp, zzbrd {
    void zza(String str);

    default void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    default void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zza(sb.toString());
    }

    default void zzd(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = o0.b;
        W5.p.a("Dispatching AFMA event: ".concat(sb2));
        zza(sb.toString());
    }

    default void zze(String str, Map map) {
        try {
            zzd(str, S5.B.a().t(map));
        } catch (JSONException unused) {
            int i = o0.b;
            W5.p.f("Could not convert parameters to JSON.");
        }
    }
}
