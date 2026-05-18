package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccb extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzccc();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzccb(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = list;
        this.zzf = z3;
        this.zzg = z4;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzccb zza(JSONObject jSONObject) throws JSONException {
        return new zzccb(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), V5.S.a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), V5.S.a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, str, false);
        y6.c.E(parcel, 3, this.zzb, false);
        y6.c.g(parcel, 4, this.zzc);
        y6.c.g(parcel, 5, this.zzd);
        y6.c.G(parcel, 6, this.zze, false);
        y6.c.g(parcel, 7, this.zzf);
        y6.c.g(parcel, 8, this.zzg);
        y6.c.G(parcel, 9, this.zzh, false);
        y6.c.b(parcel, a);
    }
}
