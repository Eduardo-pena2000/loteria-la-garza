package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfiw {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfiw(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject d = V5.S.d(jsonReader);
        this.zzd = d;
        this.zza = d.optString("ad_html", (String) null);
        this.zzb = d.optString("ad_base_url", (String) null);
        this.zzc = d.optJSONObject("ad_json");
    }
}
