package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import com.google.android.gms.common.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzahs implements zzaez {
    private static final String zza = "zzahs";
    private String zzb;
    private zzah zzc;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahs zza(String str) throws zzacn {
        zzah zzg;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = v.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    zzg = zzah.zzg();
                } else {
                    zzak zzf = zzah.zzf();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        zzf.zza(jSONObject2 == null ? zzaid.zza(null, null) : zzaid.zza(v.a(jSONObject2.optString("provider")), v.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzg = zzf.zza();
                }
                this.zzc = zzg;
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzajk.zza((Exception) e, zza, str);
        } catch (JSONException e2) {
            e = e2;
            throw zzajk.zza((Exception) e, zza, str);
        }
    }

    public final String zzb(String str) {
        t.f(str);
        zzah zzahVar = this.zzc;
        if (zzahVar != null && !zzahVar.isEmpty()) {
            zzah zzahVar2 = this.zzc;
            int size = zzahVar2.size();
            int i = 0;
            while (i < size) {
                Object obj = zzahVar2.get(i);
                i++;
                zzaid zzaidVar = (zzaid) obj;
                String zza2 = zzaidVar.zza();
                String zzb = zzaidVar.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzaidVar.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
