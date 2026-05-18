package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzekr implements zzekg {
    private final zzctl zza;
    private final zzduv zzb;
    private final zzfjk zzc;
    private final Executor zzd;
    private final W5.a zze;
    private final zzbok zzf;
    private final boolean zzg = ((Boolean) S5.D.c().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzh;
    private final zzdxt zzi;
    private final zzdxz zzj;

    public zzekr(zzctl zzctlVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, W5.a aVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = zzctlVar;
        this.zzd = executor;
        this.zzb = zzduvVar;
        this.zzc = zzfjkVar;
        this.zze = aVar;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxtVar;
        this.zzj = zzdxzVar;
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzduz zzduzVar = new zzduz();
        x7.e zza = zzgzo.zza(null);
        zzekp zzekpVar = new zzekp(this, zzfirVar, zzfjcVar, zzduzVar);
        Executor executor = this.zzd;
        x7.e zzj = zzgzo.zzj(zza, zzekpVar, executor);
        zzj.addListener(new zzekq(zzduzVar), executor);
        return zzj;
    }

    public final /* synthetic */ x7.e zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) {
        zzekr zzekrVar;
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), R5.t.o().a());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzc;
        zzcjl zza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zza.zzaw(zzfirVar.zzW);
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), R5.t.o().a());
        }
        zzcen zzcenVar = new zzcen();
        zzctl zzctlVar = this.zza;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        W5.a aVar = this.zze;
        boolean z = this.zzg;
        zzbok zzbokVar = this.zzf;
        zzcti zzf = zzctlVar.zzf(zzcwvVar, new zzdkr(new zzekt(aVar, zzcenVar, zzfirVar, zza, zzfjkVar, z, zzbokVar, this.zzh, this.zzj), zza), new zzctj(zzfirVar.zzaa));
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            zzekrVar = this;
            zzekrVar.zzi.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), R5.t.o().a());
        } else {
            zzekrVar = this;
        }
        zzduu zzi = zzf.zzi();
        zzbok zzbokVar2 = true != z ? null : zzbokVar;
        zzdxt zzdxtVar = zzekrVar.zzi;
        zzi.zzi(zza, false, zzbokVar2, zzdxtVar.zze());
        zzcenVar.zzc(zzf);
        zzf.zzd().zzq(new zzekn(zza), zzcei.zzg);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzk().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzi();
        return zzgzo.zzk(zzduu.zzj(zza, zzfiwVar.zzb, str, zzdxtVar.zze(), zzctlVar.zzd()), new zzeko(zzekrVar, zza, zzfirVar, zzf), zzekrVar.zzd);
    }
}
