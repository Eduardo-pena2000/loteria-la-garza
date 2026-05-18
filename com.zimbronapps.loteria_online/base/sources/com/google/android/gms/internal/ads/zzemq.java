package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzemq implements Callable {
    private final /* synthetic */ zzems zza;
    private final /* synthetic */ x7.e zzb;
    private final /* synthetic */ x7.e zzc;
    private final /* synthetic */ zzfjc zzd;
    private final /* synthetic */ zzfir zze;
    private final /* synthetic */ JSONObject zzf;
    private final /* synthetic */ R5.b zzg;
    private final /* synthetic */ zzcce zzh;

    public /* synthetic */ zzemq(zzems zzemsVar, x7.e eVar, x7.e eVar2, zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject, R5.b bVar, zzcce zzcceVar) {
        this.zza = zzemsVar;
        this.zzb = eVar;
        this.zzc = eVar2;
        this.zzd = zzfjcVar;
        this.zze = zzfirVar;
        this.zzf = jSONObject;
        this.zzg = bVar;
        this.zzh = zzcceVar;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzf(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
