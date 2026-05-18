package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdqz implements Callable {
    private final /* synthetic */ zzdra zza;
    private final /* synthetic */ zzfjc zzb;
    private final /* synthetic */ zzfir zzc;
    private final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdqz(zzdra zzdraVar, zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) {
        this.zza = zzdraVar;
        this.zzb = zzfjcVar;
        this.zzc = zzfirVar;
        this.zzd = jSONObject;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzb(this.zzb, this.zzc, this.zzd);
    }
}
