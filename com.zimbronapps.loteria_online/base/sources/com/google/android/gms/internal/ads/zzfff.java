package com.google.android.gms.internal.ads;

import S5.c1;
import S5.l2;
import S5.q2;
import V5.F0;
import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfff implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzerp zzd;
    private final zzert zze;
    private final ViewGroup zzf;
    private zzbhz zzg;
    private final zzdeg zzh;
    private final zzfor zzi;
    private final zzdgl zzj;
    private final zzfjj zzk;
    private x7.e zzl;
    private boolean zzm;
    private c1 zzn;
    private zzese zzo;

    public zzfff(Context context, Executor executor, q2 q2Var, zzcma zzcmaVar, zzerp zzerpVar, zzert zzertVar, zzfjj zzfjjVar, zzdgl zzdglVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zzd = zzerpVar;
        this.zze = zzertVar;
        this.zzk = zzfjjVar;
        this.zzh = zzcmaVar.zzd();
        this.zzi = zzcmaVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdglVar;
        zzfjjVar.zzc(q2Var);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        c1 c1Var = this.zzn;
        this.zzn = null;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjw)).booleanValue() && c1Var != null) {
            this.zzb.execute(new zzffc(this, c1Var));
        }
        zzese zzeseVar = this.zzo;
        if (zzeseVar != null) {
            zzeseVar.zza();
        }
    }

    public final boolean zza(l2 l2Var, String str, zzesd zzesdVar, zzese zzeseVar) throws RemoteException {
        zzcvc zza;
        if (str == null) {
            int i = o0.b;
            W5.p.c("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzffd(this));
            return false;
        }
        if (!zzb()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcZ)).booleanValue()) {
                S5.B.c();
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue() && l2Var.f) {
                this.zzc.zzw().zzc(true);
            }
            Bundle zza2 = zzdxj.zza(new Pair(zzdxh.zza.zza(), Long.valueOf(l2Var.z)), new Pair(zzdxh.zzb.zza(), Long.valueOf(R5.t.o().a())));
            zzfjj zzfjjVar = this.zzk;
            zzfjjVar.zzg(str);
            zzfjjVar.zza(l2Var);
            zzfjjVar.zzv(zza2);
            Context context = this.zza;
            zzfjk zzA = zzfjjVar.zzA();
            zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 3, l2Var);
            zzfoo zzfooVar = null;
            if (!((Boolean) zzbjk.zze.zze()).booleanValue() || !zzfjjVar.zzf().k) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzjw)).booleanValue()) {
                    zzcvb zzi = this.zzc.zzi();
                    zzdan zzdanVar = new zzdan();
                    zzdanVar.zza(context);
                    zzdanVar.zzb(zzA);
                    zzi.zzl(zzdanVar.zze());
                    zzdhe zzdheVar = new zzdhe();
                    zzerp zzerpVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdheVar.zzm(zzerpVar, executor);
                    zzdheVar.zze(zzerpVar, executor);
                    zzi.zzm(zzdheVar.zzn());
                    zzi.zzk(new zzepw(this.zzg));
                    zzi.zzd(new zzdml(zzdor.zza, null));
                    zzi.zzg(new zzcvx(this.zzh, this.zzj));
                    zzi.zze(new zzctu(this.zzf));
                    zza = zzi.zza();
                } else {
                    zzcvb zzi2 = this.zzc.zzi();
                    zzdan zzdanVar2 = new zzdan();
                    zzdanVar2.zza(context);
                    zzdanVar2.zzb(zzA);
                    zzi2.zzl(zzdanVar2.zze());
                    zzdhe zzdheVar2 = new zzdhe();
                    zzerp zzerpVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdheVar2.zzm(zzerpVar2, executor2);
                    zzdheVar2.zzf(zzerpVar2, executor2);
                    zzdheVar2.zzf(this.zze, executor2);
                    zzdheVar2.zzg(zzerpVar2, executor2);
                    zzdheVar2.zzh(zzerpVar2, executor2);
                    zzdheVar2.zza(zzerpVar2, executor2);
                    zzdheVar2.zzb(zzerpVar2, executor2);
                    zzdheVar2.zzc(zzerpVar2, executor2);
                    zzdheVar2.zze(zzerpVar2, executor2);
                    zzdheVar2.zzk(zzerpVar2, executor2);
                    zzi2.zzm(zzdheVar2.zzn());
                    zzi2.zzk(new zzepw(this.zzg));
                    zzi2.zzd(new zzdml(zzdor.zza, null));
                    zzi2.zzg(new zzcvx(this.zzh, this.zzj));
                    zzi2.zze(new zzctu(this.zzf));
                    zza = zzi2.zza();
                }
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfooVar = zza.zze();
                    zzfooVar.zzi(3);
                    zzfooVar.zzc(l2Var.p);
                    zzfooVar.zzd(l2Var.m);
                }
                this.zzo = zzeseVar;
                zzcxj zzc = zza.zzc();
                x7.e zzc2 = zzc.zzc(zzc.zzb());
                this.zzl = zzc2;
                zzgzo.zzr(zzc2, new zzffb(this, zzfooVar, zzo, zza), this.zzb);
                return true;
            }
            zzerp zzerpVar3 = this.zzd;
            if (zzerpVar3 != null) {
                zzerpVar3.zzdI(zzfkm.zzd(7, null, null));
            }
        } else if (!this.zzk.zzB()) {
            this.zzm = true;
        }
        return false;
    }

    public final boolean zzb() {
        x7.e eVar = this.zzl;
        return (eVar == null || eVar.isDone()) ? false : true;
    }

    public final void zzc() {
        synchronized (this) {
            try {
                x7.e eVar = this.zzl;
                if (eVar != null && eVar.isDone()) {
                    try {
                        zzctx zzctxVar = (zzctx) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzctxVar.zza();
                        ViewGroup parent = zzctxVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String zze = zzctxVar.zzn() != null ? zzctxVar.zzn().zze() : "";
                            StringBuilder sb = new StringBuilder(String.valueOf(zze).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(zze);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String sb2 = sb.toString();
                            int i = o0.b;
                            W5.p.f(sb2);
                            parent.removeView(zzctxVar.zza());
                        }
                        zzbgv zzbgvVar = zzbhe.zzjw;
                        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                            zzdev zzq = zzctxVar.zzq();
                            zzq.zza(this.zzd);
                            zzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzctxVar.zza());
                        zzese zzeseVar = this.zzo;
                        if (zzeseVar != null) {
                            zzeseVar.zzb(zzctxVar);
                        }
                        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            zzerp zzerpVar = this.zzd;
                            Objects.requireNonNull(zzerpVar);
                            executor.execute(new zzffe(zzerpVar));
                        }
                        if (zzctxVar.zzh() >= 0) {
                            this.zzm = false;
                            zzdeg zzdegVar = this.zzh;
                            zzdegVar.zzd(zzctxVar.zzh());
                            zzdegVar.zze(zzctxVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzctxVar.zzg());
                        }
                    } catch (ExecutionException e) {
                        e = e;
                        zzn();
                        o0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    } catch (InterruptedException e2) {
                        e = e2;
                        zzn();
                        o0.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    }
                } else if (this.zzl != null) {
                    o0.k("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    o0.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbhz zzbhzVar) {
        this.zzg = zzbhzVar;
    }

    public final void zzf(S5.H h) {
        this.zze.zza(h);
    }

    public final zzfjj zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        View parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = parent;
        R5.t.g();
        return F0.E(view, view.getContext());
    }

    public final void zzi(zzdeb zzdebVar) {
        this.zzh.zzq(zzdebVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ void zzm(c1 c1Var) {
        this.zzd.zzdI(c1Var);
    }

    public final /* synthetic */ zzdeg zzo() {
        return this.zzh;
    }

    public final /* synthetic */ zzfor zzp() {
        return this.zzi;
    }

    public final /* synthetic */ zzdgl zzq() {
        return this.zzj;
    }

    public final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    public final /* synthetic */ void zzs(c1 c1Var) {
        this.zzn = c1Var;
    }
}
