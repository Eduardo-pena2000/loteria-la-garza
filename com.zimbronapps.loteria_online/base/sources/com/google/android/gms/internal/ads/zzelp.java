package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzelp implements zzekm {
    private final Context zza;
    private final zzcvc zzb;
    private View zzc;
    private zzbuc zzd;

    public zzelp(Context context, zzcvc zzcvcVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
                String str = zzfirVar.zzU;
                String jSONObject = zzfirVar.zzv.toString();
                zzfjk zzfjkVar = zzfjcVar.zza.zza;
                zzbvsVar.zzq(str, jSONObject, zzfjkVar.zzd, N6.b.s1(this.zza), new zzelo(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar.zzf);
                return;
            }
            String str2 = zzfirVar.zzU;
            String jSONObject2 = zzfirVar.zzv.toString();
            zzfjk zzfjkVar2 = zzfjcVar.zza.zza;
            zzbvsVar.zzi(str2, jSONObject2, zzfjkVar2.zzd, N6.b.s1(this.zza), new zzelo(this, zzekjVar, null), (zzbtz) zzekjVar.zzc, zzfjkVar2.zzf);
        } catch (RemoteException e) {
            throw new zzfjr(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        View view;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            try {
                view = (View) N6.b.r1(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfjr(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgzo.zzj(zzgzo.zza(null), new zzelm(this, view, zzfirVar), zzcei.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfjr(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfjr(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcty zzf2 = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzcue(view, null, new zzeln(zzekjVar), (zzfis) zzfirVar.zzu.get(0)));
        zzf2.zzk().zza(view);
        ((zzelv) zzekjVar.zzc).zzc(zzf2.zzg());
        return zzf2.zzi();
    }

    public final /* synthetic */ x7.e zzc(View view, zzfir zzfirVar, Object obj) {
        return zzgzo.zza(zzcvr.zza(this.zza, view, zzfirVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbuc zzbucVar) {
        this.zzd = zzbucVar;
    }
}
