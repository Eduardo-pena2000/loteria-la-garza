package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzemg implements zzekm {
    private final Context zza;
    private final zzdlu zzb;
    private final W5.a zzc;
    private final Executor zzd;

    public zzemg(Context context, W5.a aVar, zzdlu zzdluVar, Executor executor) {
        this.zza = context;
        this.zzc = aVar;
        this.zzb = zzdluVar;
        this.zzd = executor;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String jSONObject = zzfirVar.zzv.toString();
        String m = V5.S.m(zzfirVar.zzs);
        zzfkiVar.zzh(this.zza, zzfjkVar.zzd, jSONObject, m, (zzbtz) zzekjVar.zzc);
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdko zzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(new zzemf(this, zzekjVar, zzfirVar), null));
        zzd.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzd);
        ((zzelv) zzekjVar.zzc).zzc(zzd.zzf());
        return zzd.zzh();
    }

    public final /* synthetic */ W5.a zzc() {
        return this.zzc;
    }
}
