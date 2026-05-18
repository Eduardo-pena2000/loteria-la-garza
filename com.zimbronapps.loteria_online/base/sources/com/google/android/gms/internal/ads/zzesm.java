package com.google.android.gms.internal.ads;

import S5.l2;
import S5.p0;
import V5.F0;
import V5.o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzesm implements zzesf {
    private final zzfjj zza;
    private final zzcma zzb;
    private final Context zzc;
    private final zzesc zzd;
    private final zzfor zze;
    private zzcwu zzf;

    public zzesm(zzcma zzcmaVar, Context context, zzesc zzescVar, zzfjj zzfjjVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = zzescVar;
        this.zza = zzfjjVar;
        this.zze = zzcmaVar.zzx();
        zzfjjVar.zzt(zzescVar.zzc());
    }

    public final boolean zza(l2 l2Var, String str, zzesd zzesdVar, zzese zzeseVar) throws RemoteException {
        zzfoo zzfooVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcZ)).booleanValue()) {
            S5.B.c();
        }
        R5.t.g();
        Context context = this.zzc;
        if (F0.m(context) && l2Var.s == null) {
            int i = o0.b;
            W5.p.c("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new zzesl(this));
            return false;
        }
        if (str == null) {
            int i2 = o0.b;
            W5.p.c("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new zzesk(this));
            return false;
        }
        boolean z = l2Var.f;
        zzfkh.zzb(context, z);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue() && z) {
            this.zzb.zzw().zzc(true);
        }
        int i3 = ((zzesg) zzesdVar).zza;
        long a = R5.t.o().a();
        String zza = zzdxh.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(a);
        Bundle zza2 = zzdxj.zza(new Pair(zza, valueOf), new Pair(zzdxh.DYNAMITE_ENTER.zza(), valueOf));
        zzfjj zzfjjVar = this.zza;
        zzfjjVar.zza(l2Var);
        zzfjjVar.zzv(zza2);
        zzfjjVar.zzl(i3);
        zzfjk zzA = zzfjjVar.zzA();
        zzfoe zzo = zzfoe.zzo(context, zzfon.zzg(zzA), 8, l2Var);
        p0 p0Var = zzA.zzo;
        if (p0Var != null) {
            this.zzd.zzc().zzn(p0Var);
        }
        zzcma zzcmaVar = this.zzb;
        zzdmp zzo2 = zzcmaVar.zzo();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(context);
        zzdanVar.zzb(zzA);
        zzo2.zzf(zzdanVar.zze());
        zzdhe zzdheVar = new zzdhe();
        zzesc zzescVar = this.zzd;
        zzdheVar.zze(zzescVar.zzc(), zzcmaVar.zzb());
        zzo2.zzg(zzdheVar.zzn());
        zzo2.zze(zzescVar.zzb());
        zzo2.zzd(new zzctu(null));
        zzdmq zzh = zzo2.zzh();
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfoo zzc = zzh.zzc();
            zzc.zzi(8);
            zzc.zzc(l2Var.p);
            zzc.zzd(l2Var.m);
            zzfooVar = zzc;
        } else {
            zzfooVar = null;
        }
        zzcmaVar.zzv().zza(1);
        zzgzy zzc2 = zzfmk.zzc();
        ScheduledExecutorService zzc3 = zzcmaVar.zzc();
        zzcxj zza3 = zzh.zza();
        zzcwu zzcwuVar = new zzcwu(zzc2, zzc3, zza3.zzc(zza3.zzb()));
        this.zzf = zzcwuVar;
        zzcwuVar.zza(new zzesj(this, zzeseVar, zzfooVar, zzo, zzh));
        return true;
    }

    public final boolean zzb() {
        zzcwu zzcwuVar = this.zzf;
        return zzcwuVar != null && zzcwuVar.zzb();
    }

    public final /* synthetic */ void zzc() {
        this.zzd.zze().zzdI(zzfkm.zzd(4, null, null));
    }

    public final /* synthetic */ void zzd() {
        this.zzd.zze().zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ zzcma zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzesc zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzfor zzg() {
        return this.zze;
    }
}
