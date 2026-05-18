package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdkq implements zzdct {
    private final /* synthetic */ Context zza;
    private final /* synthetic */ W5.a zzb;
    private final /* synthetic */ zzfir zzc;
    private final /* synthetic */ zzfjk zzd;

    public /* synthetic */ zzdkq(Context context, W5.a aVar, zzfir zzfirVar, zzfjk zzfjkVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzfirVar;
        this.zzd = zzfjkVar;
    }

    public final /* synthetic */ void zzg() {
        zzfjk zzfjkVar = this.zzd;
        JSONObject jSONObject = this.zzc.zzC;
        R5.t.s().g(this.zza, this.zzb.a, jSONObject.toString(), zzfjkVar.zzg);
    }
}
