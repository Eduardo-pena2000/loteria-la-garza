package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzezg implements zzfav {
    private final Map zza;

    public zzezg(Map map) {
        this.zza = map;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Map map = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (map.isEmpty()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            if (!arrayDeque.isEmpty()) {
                zzdzf zzdzfVar = (zzdzf) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", zzdzfVar.zza());
                    jSONObject.put("event_type", zzdzfVar.zzb());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((Long) it.next());
                    }
                    jSONObject.put("timestamps", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    o0.l("Failed putting the on-device storage record.", e);
                }
            }
        }
        if (jSONArray.length() > 0) {
            bundle.putString("on_device_storage_records", jSONArray.toString());
        }
    }
}
