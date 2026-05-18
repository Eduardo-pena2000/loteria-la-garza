package com.google.android.gms.internal.firebase-auth-api;

import J7.e;
import android.annotation.SuppressLint;
import com.google.android.gms.common.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahm implements zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private e zze;
    private String zzf;
    private String zzg;

    public zzahm(int i) {
        this.zza = zza(i);
    }

    public static zzahm zza(e eVar, String str, String str2) {
        t.f(str);
        t.f(str2);
        t.l(eVar);
        return new zzahm(7, eVar, null, str2, str, null, null);
    }

    public final e zzb() {
        return this.zze;
    }

    public final zzahm zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahm zzd(String str) {
        this.zzd = t.f(str);
        return this;
    }

    public final zzahm zzb(String str) {
        this.zzb = t.f(str);
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzahm(int i, e eVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (e) t.l(eVar);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahm zza(e eVar) {
        this.zze = (e) t.l(eVar);
        return this;
    }

    public final zzahm zza(String str) {
        this.zzg = str;
        return this;
    }

    @SuppressLint({"SwitchIntDef"})
    private static String zza(int i) {
        if (i == 1) {
            return "PASSWORD_RESET";
        }
        if (i == 4) {
            return "VERIFY_EMAIL";
        }
        if (i == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    public final String zza() throws JSONException {
        int i;
        i = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i = 7;
                break;
            case "EMAIL_SIGNIN":
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        jSONObject.put("requestType", i);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        e eVar = this.zze;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.N1());
            jSONObject.put("canHandleCodeInApp", this.zze.M1());
            if (this.zze.S1() != null) {
                jSONObject.put("continueUrl", this.zze.S1());
            }
            if (this.zze.Q1() != null) {
                jSONObject.put("iosBundleId", this.zze.Q1());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.P1() != null) {
                jSONObject.put("androidPackageName", this.zze.P1());
            }
            if (this.zze.O1() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.O1());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
            if (this.zze.R1() != null) {
                jSONObject.put("linkDomain", this.zze.R1());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzajk.zza(jSONObject, "captchaResp", str6);
        } else {
            zzajk.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
