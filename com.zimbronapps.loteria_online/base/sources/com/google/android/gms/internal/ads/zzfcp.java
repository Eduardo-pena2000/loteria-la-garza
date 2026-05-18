package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfcp implements zzfax {
    private final JSONObject zza;

    public zzfcp(Context context) {
        this.zza = zzbzq.zzc(context, W5.a.M1());
    }

    public final x7.e zza() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zznt)).booleanValue() ? zzgzo.zza(zzfcn.zza) : zzgzo.zza(new zzfco(this));
    }

    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            o0.k("Failed putting version constants.");
        }
    }
}
