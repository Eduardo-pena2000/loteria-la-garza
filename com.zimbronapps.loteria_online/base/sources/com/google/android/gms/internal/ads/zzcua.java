package com.google.android.gms.internal.ads;

import S5.Y;
import S5.g1;
import S5.q2;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcua extends zzctx {
    private final Context zzc;
    private final View zzd;
    private final zzcjl zze;
    private final zzfis zzf;
    private final zzcwd zzg;
    private final zzdor zzh;
    private final zzdjo zzi;
    private final zzika zzj;
    private final Executor zzk;
    private q2 zzl;

    public zzcua(zzcwe zzcweVar, Context context, zzfis zzfisVar, View view, zzcjl zzcjlVar, zzcwd zzcwdVar, zzdor zzdorVar, zzdjo zzdjoVar, zzika zzikaVar, Executor executor) {
        super(zzcweVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcjlVar;
        this.zzf = zzfisVar;
        this.zzg = zzcwdVar;
        this.zzh = zzdorVar;
        this.zzi = zzdjoVar;
        this.zzj = zzikaVar;
        this.zzk = executor;
    }

    public final View zza() {
        return this.zzd;
    }

    public final void zzb(ViewGroup viewGroup, q2 q2Var) {
        zzcjl zzcjlVar;
        if (viewGroup == null || (zzcjlVar = this.zze) == null) {
            return;
        }
        zzcjlVar.zzaf(zzclv.zza(q2Var));
        viewGroup.setMinimumHeight(q2Var.c);
        viewGroup.setMinimumWidth(q2Var.f);
        this.zzl = q2Var;
    }

    public final g1 zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfjr unused) {
            return null;
        }
    }

    public final zzfis zze() {
        q2 q2Var = this.zzl;
        if (q2Var != null) {
            return zzfjq.zzb(q2Var);
        }
        zzfir zzfirVar = this.zzb;
        if (zzfirVar.zzac) {
            for (String str : zzfirVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfis(view.getWidth(), view.getHeight(), false);
        }
        return (zzfis) zzfirVar.zzr.get(0);
    }

    public final zzfis zzf() {
        return this.zzf;
    }

    public final int zzg() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzje)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    public final void zzi() {
        this.zzi.zza();
    }

    public final void zzj() {
        this.zzk.execute(new zzctz(this));
        super.zzj();
    }

    public final /* synthetic */ void zzk() {
        zzbmd zzd = this.zzh.zzd();
        if (zzd == null) {
            return;
        }
        try {
            zzd.zze((Y) this.zzj.zzb(), N6.b.s1(this.zzc));
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.d("RemoteException when notifyAdLoad is called", e);
        }
    }
}
