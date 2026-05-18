package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzctb implements Runnable {
    private final /* synthetic */ zzctc zza;
    private final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzctb(zzctc zzctcVar, JSONObject jSONObject) {
        this.zza = zzctcVar;
        this.zzb = jSONObject;
    }

    public final /* synthetic */ void run() {
        this.zza.zzf(this.zzb);
    }
}
