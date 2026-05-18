package com.google.android.gms.internal.firebase-auth-api;

import E6.v;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahy {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzaiz zze;

    private zzahy(String str, String str2, String str3, long j, zzaiz zzaizVar) {
        if (!TextUtils.isEmpty(str) && zzaizVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = t.f(str2);
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzaizVar;
    }

    private static long zza(String str) {
        try {
            return zzaoo.zza(zzaoo.zza(str));
        } catch (ParseException e) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e);
            return 0L;
        }
    }

    public final zzaiz zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzahy zza(JSONObject jSONObject) {
        zzahy zzahyVar = new zzahy(v.a(jSONObject.optString("phoneInfo")), v.a(jSONObject.optString("mfaEnrollmentId")), v.a(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzaiz() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahyVar;
    }

    public static List zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(zza(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
