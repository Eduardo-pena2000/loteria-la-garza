package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdol extends zzdom {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdol(zzfir zzfirVar, JSONObject jSONObject) {
        super(zzfirVar);
        this.zzb = V5.S.i(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = V5.S.j(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = V5.S.j(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zze = V5.S.j(false, jSONObject, "enable_omid");
        this.zzg = V5.S.k("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    public final JSONObject zza() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final zzfjn zzg() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfjn(jSONObject) : this.zza.zzV;
    }
}
