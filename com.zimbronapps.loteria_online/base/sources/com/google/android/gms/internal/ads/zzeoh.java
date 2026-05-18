package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeoh implements zzekm {
    private final Context zza;
    private final zzdue zzb;

    public zzeoh(Context context, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = zzdueVar;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzp.zza == 3) {
                zzbvsVar.zzp(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjkVar.zzd, N6.b.s1(this.zza), new zzeog(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
            } else {
                zzbvsVar.zzl(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjkVar.zzd, N6.b.s1(this.zza), new zzeog(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
            }
        } catch (RemoteException e) {
            o0.l("Remote exception loading a rewarded RTB ad", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, L5.c.REWARDED);
        zzdua zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(zzemeVar));
        zzemeVar.zzc(zzf.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzf.zzn());
        return zzf.zzh();
    }
}
