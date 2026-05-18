package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeoz implements zzekm {
    private final Context zza;
    private final Executor zzb;
    private final zzdue zzc;

    public zzeoz(Context context, Executor executor, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdueVar;
    }

    public static final /* synthetic */ void zzd(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        zze(zzfjcVar, zzfirVar, zzekjVar);
    }

    private static final void zze(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            ((zzfki) zzekjVar.zzb).zzl(zzfjcVar.zza.zza.zzd, zzfirVar.zzv.toString());
        } catch (Exception e) {
            String str = zzekjVar.zza;
            int i = o0.b;
            W5.p.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        if (zzfkiVar.zzn()) {
            zze(zzfjcVar, zzfirVar, zzekjVar);
            return;
        }
        zzeow zzeowVar = new zzeow(this, zzfjcVar, zzfirVar, zzekjVar);
        zzdcp zzdcpVar = zzekjVar.zzc;
        ((zzelw) zzdcpVar).zzd(zzeowVar);
        Context context = this.zza;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String jSONObject = zzfirVar.zzv.toString();
        zzfkiVar.zzk(context, zzfjkVar.zzd, null, (zzcar) zzdcpVar, jSONObject);
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdua zzf = this.zzc.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(new zzeox(this, zzekjVar, zzfirVar)));
        zzf.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzb);
        zzdcm zzb = zzf.zzb();
        zzdbd zzc = zzf.zzc();
        ((zzelw) zzekjVar.zzc).zzc(new zzeoy(this, zzf.zzi(), zzc, zzb, zzf.zzk()));
        return zzf.zzh();
    }

    public final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}
