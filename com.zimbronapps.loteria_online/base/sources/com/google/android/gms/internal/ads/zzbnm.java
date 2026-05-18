package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnm implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator keys = jSONObject.keys();
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcjlVar.getContext()).edit();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj2 = jSONObject.get(str);
                if (obj2 instanceof Integer) {
                    edit.putInt(str, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    edit.putLong(str, ((Long) obj2).longValue());
                } else if (obj2 instanceof Double) {
                    edit.putFloat(str, ((Double) obj2).floatValue());
                } else if (obj2 instanceof Float) {
                    edit.putFloat(str, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof String) {
                    edit.putString(str, (String) obj2);
                }
            }
            edit.apply();
        } catch (JSONException e) {
            R5.t.l().zzg(e, "GMSG write local storage KV pairs handler");
        }
    }
}
