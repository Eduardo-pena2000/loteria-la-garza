package com.google.android.gms.internal.firebase-auth-api;

import A6.a;
import J7.f;
import J7.j;
import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzagx implements zzafa {
    private static final String zza = "zzagx";
    private final String zzb;
    private final String zzc;
    private final j zzd;
    private final String zze;
    private final String zzf;

    static {
        new a(zzagx.class.getSimpleName(), new String[0]);
    }

    public zzagx(j jVar, String str, String str2) {
        this.zzd = (j) t.l(jVar);
        this.zzb = t.f(jVar.zzc());
        this.zzc = t.f(jVar.zze());
        this.zze = str;
        this.zzf = str2;
    }

    public final String zza() throws JSONException {
        f c = f.c(this.zzc);
        String a = c != null ? c.a() : null;
        String d = c != null ? c.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (a != null) {
            jSONObject.put("oobCode", a);
        }
        if (d != null) {
            jSONObject.put("tenantId", d);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzajk.zza(jSONObject, "captchaResp", str2);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final j zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
