package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzezx implements Callable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ Bundle zzb;
    private final /* synthetic */ String zzc;

    public /* synthetic */ zzezx(List list, Bundle bundle, String str) {
        this.zza = list;
        this.zzb = bundle;
        this.zzc = str;
    }

    public final /* synthetic */ Object call() {
        int i = zzfad.zzb;
        JSONArray jSONArray = new JSONArray();
        for (x7.e eVar : this.zza) {
            if (((JSONObject) eVar.get()) != null) {
                jSONArray.put(eVar.get());
            }
        }
        String str = this.zzc;
        Bundle bundle = this.zzb;
        if (jSONArray.length() != 0) {
            return new zzfae(jSONArray.toString(), bundle, str);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfc)).booleanValue()) {
            return new zzfae(new JSONArray().toString(), bundle, str);
        }
        return null;
    }
}
