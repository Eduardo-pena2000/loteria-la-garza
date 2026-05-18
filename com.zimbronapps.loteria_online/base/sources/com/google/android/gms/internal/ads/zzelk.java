package com.google.android.gms.internal.ads;

import S5.q2;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzelk implements zzekm {
    private final Context zza;
    private final zzcvc zzb;
    private final Executor zzc;

    public zzelk(Context context, zzcvc zzcvcVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcvcVar;
        this.zzc = executor;
    }

    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        q2 q2Var;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        q2 q2Var2 = zzfjkVar.zzf;
        if (q2Var2.n) {
            q2Var = new q2(this.zza, L5.F.b(q2Var2.e, q2Var2.b));
        } else {
            q2Var = (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) ? new q2(this.zza, L5.F.c(q2Var2.e, q2Var2.b)) : zzfjq.zza(this.zza, zzfirVar.zzu);
        }
        q2 q2Var3 = q2Var;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            ((zzfki) zzekjVar.zzb).zzb(this.zza, q2Var3, zzfjkVar.zzd, zzfirVar.zzv.toString(), V5.S.m(zzfirVar.zzs), (zzbtz) zzekjVar.zzc);
        } else {
            ((zzfki) zzekjVar.zzb).zzg(this.zza, q2Var3, zzfjkVar.zzd, zzfirVar.zzv.toString(), V5.S.m(zzfirVar.zzs), (zzbtz) zzekjVar.zzc);
        }
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        View zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) {
            zzbuc zzc = ((zzfki) zzekjVar.zzb).zzc();
            if (zzc == null) {
                int i = o0.b;
                W5.p.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfjr(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) N6.b.r1(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfjr(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgzo.zzj(zzgzo.zza(null), new zzeli(this, zza, zzfirVar), zzcei.zzf).get();
                    } catch (ExecutionException | InterruptedException e) {
                        throw new zzfjr(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfjr(e2);
            }
        } else {
            zza = ((zzfki) zzekjVar.zzb).zza();
        }
        zzcvc zzcvcVar = this.zzb;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza);
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        Objects.requireNonNull(zzfkiVar);
        zzcty zzf2 = zzcvcVar.zzf(zzcwvVar, new zzcue(zza, null, new zzelj(zzfkiVar), (zzfis) zzfirVar.zzu.get(0)));
        zzf2.zzk().zza(zza);
        zzf2.zza().zzq(new zzcrl(zzfkiVar), this.zzc);
        ((zzelv) zzekjVar.zzc).zzc(zzf2.zzf());
        return zzf2.zzi();
    }

    public final /* synthetic */ x7.e zzc(View view, zzfir zzfirVar, Object obj) {
        return zzgzo.zza(zzcvr.zza(this.zza, view, zzfirVar));
    }
}
