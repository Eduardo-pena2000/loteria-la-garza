package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeky implements zzekm {
    private final Context zza;
    private final zzctl zzb;

    public zzeky(Context context, zzctl zzctlVar) {
        this.zza = context;
        this.zzb = zzctlVar;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzbvsVar.zzs(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, N6.b.s1(this.zza), new zzekx(zzekjVar, null), (zzbtz) zzekjVar.zzc);
        } catch (RemoteException e) {
            o0.l("Remote exception loading an app open RTB ad", e);
            throw new zzfjr(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, L5.c.APP_OPEN_AD);
        zzcti zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(zzemeVar, null), new zzctj(zzfirVar.zzaa));
        zzemeVar.zzc(zzf.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzg());
        return zzf.zzh();
    }
}
