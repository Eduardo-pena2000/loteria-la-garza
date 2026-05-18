package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeoe implements zzekm {
    private final Context zza;
    private final Executor zzb;
    private final zzdue zzc;

    public zzeoe(Context context, Executor executor, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdueVar;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzp.zza == 3) {
                ((zzfki) zzekjVar.zzb).zzx(this.zza, zzfjkVar.zzd, zzfirVar.zzv.toString(), (zzbtz) zzekjVar.zzc);
            } else {
                ((zzfki) zzekjVar.zzb).zzv(this.zza, zzfjkVar.zzd, zzfirVar.zzv.toString(), (zzbtz) zzekjVar.zzc);
            }
        } catch (Exception e) {
            String str = zzekjVar.zza;
            int i = o0.b;
            W5.p.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdua zzf = this.zzc.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(new zzeod(this, zzekjVar, zzfirVar)));
        zzf.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzb);
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzm());
        return zzf.zzh();
    }
}
