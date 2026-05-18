package com.google.android.gms.internal.ads;

import S5.q2;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzduv {
    private final Context zza;
    private final zzazh zzb;
    private final zzbil zzc;
    private final W5.a zzd;
    private final R5.a zze;
    private final zzbgd zzf;
    private final zzdeg zzg;
    private final zzejf zzh;
    private final zzfjo zzi;
    private final zzdxz zzj;
    private final zzclk zzk;

    public zzduv(zzckb zzckbVar, Context context, zzazh zzazhVar, zzbil zzbilVar, W5.a aVar, R5.a aVar2, zzbgd zzbgdVar, zzdeg zzdegVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxz zzdxzVar, zzclk zzclkVar) {
        this.zza = context;
        this.zzb = zzazhVar;
        this.zzc = zzbilVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbgdVar;
        this.zzg = zzdegVar;
        this.zzh = zzejfVar;
        this.zzi = zzfjoVar;
        this.zzj = zzdxzVar;
        this.zzk = zzclkVar;
    }

    public final zzcjl zza(q2 q2Var, zzfir zzfirVar, zzfiu zzfiuVar) throws zzcka {
        zzclv zza = zzclv.zza(q2Var);
        String str = q2Var.a;
        zzduk zzdukVar = new zzduk(this);
        zzazh zzazhVar = this.zzb;
        zzejf zzejfVar = this.zzh;
        zzcjl zza2 = zzckb.zza(this.zza, zza, str, false, false, zzazhVar, this.zzc, this.zzd, null, zzdukVar, this.zze, this.zzf, zzfirVar, zzfiuVar, zzejfVar, this.zzi, this.zzj);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpy)).booleanValue()) {
            this.zzk.zza(zza2.zzD());
        }
        return zza2;
    }

    public final /* synthetic */ zzdeg zzb() {
        return this.zzg;
    }
}
