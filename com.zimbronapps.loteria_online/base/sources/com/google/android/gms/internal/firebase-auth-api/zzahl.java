package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import J7.q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzahl implements zzaez {
    private static final String zza = "zzahl";
    private zzahn zzb;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) throws zzacn {
        zzahn zzahnVar;
        int i;
        zzahk zzahkVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    zzahnVar = new zzahn(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z = false;
                    int i2 = 0;
                    while (i2 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (jSONObject2 == null) {
                            zzahkVar = new zzahk();
                            i = i2;
                        } else {
                            i = i2;
                            zzahkVar = new zzahk(v.a(jSONObject2.optString("localId", (String) null)), v.a(jSONObject2.optString("email", (String) null)), jSONObject2.optBoolean("emailVerified", z), v.a(jSONObject2.optString("displayName", (String) null)), v.a(jSONObject2.optString("photoUrl", (String) null)), zzaia.zza(jSONObject2.optJSONArray("providerUserInfo")), v.a(jSONObject2.optString("rawPassword", (String) null)), v.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzahy.zza(jSONObject2.optJSONArray("mfaInfo")), q0.N1(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzahkVar);
                        i2 = i + 1;
                        z = false;
                    }
                    zzahnVar = new zzahn(arrayList);
                }
            } else {
                zzahnVar = new zzahn();
            }
            this.zzb = zzahnVar;
            return this;
        } catch (JSONException e) {
            e = e;
            throw zzajk.zza((Exception) e, zza, str);
        } catch (NullPointerException e2) {
            e = e2;
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final List zza() {
        return this.zzb.zza();
    }
}
