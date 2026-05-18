package com.google.android.gms.internal.firebase-auth-api;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzair implements zzaez {
    private static final String zza = "zzair";

    public String zza() {
        return null;
    }

    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzair zza(String str) throws zzacn {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzaiv) ((zzair) new zzaiv().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzaix) ((zzair) new zzaix().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException e) {
            e = e;
            throw zzajk.zza((Exception) e, zza, str);
        } catch (JSONException e2) {
            e = e2;
            throw zzajk.zza((Exception) e, zza, str);
        }
    }
}
