package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzemx implements zzekm {
    private final Context zza;
    private final zzdmq zzb;
    private zzbui zzc;
    private final W5.a zzd;

    public zzemx(Context context, zzdmq zzdmqVar, W5.a aVar) {
        this.zza = context;
        this.zzb = zzdmqVar;
        this.zzd = aVar;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            if (this.zzd.c < ((Integer) S5.D.c().zzd(zzbhe.zzcn)).intValue()) {
                zzbvsVar.zzn(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, N6.b.s1(this.zza), new zzemw(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
                return;
            }
            String str = zzfirVar.zzU;
            String jSONObject = zzfirVar.zzv.toString();
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            zzbvsVar.zzr(str, jSONObject, zzfjkVar.zzd, N6.b.s1(this.zza), new zzemw(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar.zzj);
        } catch (RemoteException e) {
            throw new zzfjr(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        ArrayList arrayList = zzfjcVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzenv(2, "Unified must be used for RTB.");
        }
        zzdoh zzaf = zzdoh.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzaf.zzx()))) {
            throw new zzenv(1, "No corresponding native ad listener");
        }
        zzdoj zze = this.zzb.zze(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdos(zzaf), new zzdql(null, null, this.zzc));
        ((zzelv) zzekjVar.zzc).zzc(zze.zzg());
        return zze.zzh();
    }

    public final /* synthetic */ void zzc(zzbui zzbuiVar) {
        this.zzc = zzbuiVar;
    }
}
