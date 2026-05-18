package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdru {
    private final Executor zza;
    private final zzdrp zzb;
    private final zzdxt zzc;

    public zzdru(Executor executor, zzdrp zzdrpVar, zzdxt zzdxtVar) {
        this.zza = executor;
        this.zzb = zzdrpVar;
        this.zzc = zzdxtVar;
    }

    public final x7.e zza(JSONObject jSONObject, String str) {
        x7.e zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgzo.zza(Collections.emptyList());
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzc.zze().putLong(zzdxh.zzaj.zza(), R5.t.o().a());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzgzo.zza(null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzgzo.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zza = "string".equals(optString2) ? zzgzo.zza(new zzdrr(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgzo.zzk(this.zzb.zza(optJSONObject, "image_value", null), new zzdrs(optString), this.zza) : zzgzo.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdrt.zza, this.zza);
    }
}
