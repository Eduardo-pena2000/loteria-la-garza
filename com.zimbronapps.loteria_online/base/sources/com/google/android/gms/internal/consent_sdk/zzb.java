package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzb implements Callable {
    public final /* synthetic */ zzd zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ JSONObject zzc;

    public /* synthetic */ zzb(zzd zzdVar, String str, JSONObject jSONObject) {
        this.zza = zzdVar;
        this.zzb = str;
        this.zzc = jSONObject;
    }

    public final Object call() {
        return Boolean.valueOf(this.zza.zzb(this.zzb, this.zzc));
    }
}
