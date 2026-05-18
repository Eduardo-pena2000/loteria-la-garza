package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzekv implements zzekm {
    private final Context zza;
    private final zzctl zzb;
    private final Executor zzc;

    public zzekv(Context context, zzctl zzctlVar, Executor executor) {
        this.zza = context;
        this.zzb = zzctlVar;
        this.zzc = executor;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String jSONObject = zzfirVar.zzv.toString();
        zzfkiVar.zzy(this.zza, zzfjkVar.zzd, jSONObject, (zzbtz) zzekjVar.zzc);
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzcti zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(new zzeku(this, zzekjVar, zzfirVar), null), new zzctj(zzfirVar.zzaa));
        zzf.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzc);
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzf());
        return zzf.zzh();
    }
}
