package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzemj implements zzekm {
    private final Context zza;
    private final zzdlu zzb;

    public zzemj(Context context, zzdlu zzdluVar) {
        this.zza = context;
        this.zzb = zzdluVar;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzbvsVar.zzj(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, N6.b.s1(this.zza), new zzemi(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
        } catch (RemoteException e) {
            o0.l("Remote exception loading a interstitial RTB ad", e);
            throw new zzfjr(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, L5.c.INTERSTITIAL);
        zzdko zzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(zzemeVar, null));
        zzemeVar.zzc(zzd.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzd.zzg());
        return zzd.zzh();
    }
}
