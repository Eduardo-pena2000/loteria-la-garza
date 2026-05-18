package com.google.android.gms.internal.firebase-auth-api;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzagv implements zzaez {
    private static final String zza = "zzagv";
    private List zzb;

    public zzagv() {
        zzaiw.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagv zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", (String) null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString("providerId", (String) null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                new zzaiw(1, zzajk.zza(jSONObject.optJSONArray("allProviders")));
            } else {
                zzaiw.zza();
            }
            this.zzb = zzajk.zza(jSONObject.optJSONArray("signinMethods"));
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
        return this.zzb;
    }
}
