package com.google.android.gms.internal.ads;

import S5.l2;
import S5.q2;
import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfgv implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzerp zzd;
    private final zzfhv zze;
    private zzbhz zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private x7.e zzi;

    public zzfgv(Context context, Executor executor, zzcma zzcmaVar, zzerp zzerpVar, zzfhv zzfhvVar, zzfjj zzfjjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zzd = zzerpVar;
        this.zzh = zzfjjVar;
        this.zze = zzfhvVar;
        this.zzg = zzcmaVar.zzx();
    }

    public final boolean zza(l2 l2Var, String str, zzesd zzesdVar, zzese zzeseVar) {
        zzdlu zzh;
        zzfoo zzfooVar;
        if (str == null) {
            int i = o0.b;
            W5.p.c("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzfgu(this));
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcZ)).booleanValue()) {
            S5.B.c();
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue() && l2Var.f) {
            this.zzc.zzw().zzc(true);
        }
        q2 q2Var = ((zzfgo) zzesdVar).zza;
        Bundle zza = zzdxj.zza(new Pair(zzdxh.zza.zza(), Long.valueOf(l2Var.z)), new Pair(zzdxh.zzb.zza(), Long.valueOf(R5.t.o().a())));
        zzfjj zzfjjVar = this.zzh;
        zzfjjVar.zzg(str);
        zzfjjVar.zzc(q2Var);
        zzfjjVar.zza(l2Var);
        zzfjjVar.zzv(zza);
        Context context = this.zza;
        zzfjk zzA = zzfjjVar.zzA();
        zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 4, l2Var);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjy)).booleanValue()) {
            zzdlt zzm = this.zzc.zzm();
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(context);
            zzdanVar.zzb(zzA);
            zzm.zze(zzdanVar.zze());
            zzdhe zzdheVar = new zzdhe();
            zzerp zzerpVar = this.zzd;
            Executor executor = this.zzb;
            zzdheVar.zzm(zzerpVar, executor);
            zzdheVar.zze(zzerpVar, executor);
            zzm.zzf(zzdheVar.zzn());
            zzm.zzd(new zzepw(this.zzf));
            zzh = zzm.zzh();
        } else {
            zzdhe zzdheVar2 = new zzdhe();
            zzfhv zzfhvVar = this.zze;
            if (zzfhvVar != null) {
                Executor executor2 = this.zzb;
                zzdheVar2.zza(zzfhvVar, executor2);
                zzdheVar2.zzb(zzfhvVar, executor2);
                zzdheVar2.zzc(zzfhvVar, executor2);
            }
            zzdlt zzm2 = this.zzc.zzm();
            zzdan zzdanVar2 = new zzdan();
            zzdanVar2.zza(context);
            zzdanVar2.zzb(zzA);
            zzm2.zze(zzdanVar2.zze());
            zzerp zzerpVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdheVar2.zzm(zzerpVar2, executor3);
            zzdheVar2.zza(zzerpVar2, executor3);
            zzdheVar2.zzb(zzerpVar2, executor3);
            zzdheVar2.zzc(zzerpVar2, executor3);
            zzdheVar2.zzf(zzerpVar2, executor3);
            zzdheVar2.zzg(zzerpVar2, executor3);
            zzdheVar2.zze(zzerpVar2, executor3);
            zzdheVar2.zzk(zzerpVar2, executor3);
            zzdheVar2.zzd(zzerpVar2, executor3);
            zzm2.zzf(zzdheVar2.zzn());
            zzm2.zzd(new zzepw(this.zzf));
            zzh = zzm2.zzh();
        }
        zzdlu zzdluVar = zzh;
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfoo zzc = zzdluVar.zzc();
            zzc.zzi(4);
            zzc.zzc(l2Var.p);
            zzc.zzd(l2Var.m);
            zzfooVar = zzc;
        } else {
            zzfooVar = null;
        }
        zzcxj zzb = zzdluVar.zzb();
        x7.e zzc2 = zzb.zzc(zzb.zzb());
        this.zzi = zzc2;
        zzgzo.zzr(zzc2, new zzfgt(this, zzeseVar, zzfooVar, zzo, zzdluVar), this.zzb);
        return true;
    }

    public final boolean zzb() {
        x7.e eVar = this.zzi;
        return (eVar == null || eVar.isDone()) ? false : true;
    }

    public final void zzc(zzbhz zzbhzVar) {
        this.zzf = zzbhzVar;
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzerp zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfhv zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzi(x7.e eVar) {
        this.zzi = null;
    }
}
