package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdnz implements Runnable {
    private final /* synthetic */ zzcjl zza;
    private final /* synthetic */ JSONObject zzb;

    public /* synthetic */ zzdnz(zzcjl zzcjlVar, JSONObject jSONObject) {
        this.zza = zzcjlVar;
        this.zzb = jSONObject;
    }

    public final /* synthetic */ void run() {
        zzguf zzgufVar = zzdoc.zzc;
        this.zza.zzd("onVideoEvent", this.zzb);
    }
}
