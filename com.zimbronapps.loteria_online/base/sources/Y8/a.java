package y8;

import android.util.Log;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a {
    public x8.e a;
    public x8.e b;

    public a(x8.e eVar, x8.e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    public static a a(x8.e eVar, x8.e eVar2) {
        return new a(eVar, eVar2);
    }

    public static String d(x8.e eVar, String str) {
        com.google.firebase.remoteconfig.internal.b f = eVar.f();
        if (f == null) {
            return null;
        }
        try {
            return f.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public A8.e b(com.google.firebase.remoteconfig.internal.b bVar) {
        JSONArray j = bVar.j();
        long k = bVar.k();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < j.length(); i++) {
            try {
                JSONObject jSONObject = j.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", new Object[]{string, jSONArray}));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(A8.d.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(c(optString)).e(k).a());
            } catch (JSONException e) {
                throw new p("Exception parsing rollouts metadata to create RolloutsState.", (Throwable) e);
            }
        }
        return A8.e.a(hashSet);
    }

    public final String c(String str) {
        String d = d(this.a, str);
        if (d != null) {
            return d;
        }
        String d2 = d(this.b, str);
        return d2 != null ? d2 : "";
    }
}
