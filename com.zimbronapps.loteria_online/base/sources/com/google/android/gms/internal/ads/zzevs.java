package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzevs implements zzfav {
    private final JSONObject zza;
    private final JSONObject zzb;

    public zzevs(JSONObject jSONObject, JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        JSONObject jSONObject = this.zza;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = this.zzb;
        zzdah zzdahVar = (zzdah) obj;
        if (jSONObject != null) {
            zzdahVar.zzb.putString("fwd_common_cld", jSONObject.toString());
        }
    }
}
