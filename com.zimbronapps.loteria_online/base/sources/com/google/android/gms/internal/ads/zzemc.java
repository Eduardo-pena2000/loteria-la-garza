package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzemc implements zzekg {
    private final Context zza;
    private final zzduv zzb;
    private final zzdlu zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final W5.a zzf;
    private final zzbok zzg;
    private final boolean zzh = ((Boolean) S5.D.c().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzi;
    private final zzdxt zzj;
    private final zzdxz zzk;

    public zzemc(Context context, W5.a aVar, zzfjk zzfjkVar, Executor executor, zzdlu zzdluVar, zzduv zzduvVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzd = zzfjkVar;
        this.zzc = zzdluVar;
        this.zze = executor;
        this.zzf = aVar;
        this.zzb = zzduvVar;
        this.zzg = zzbokVar;
        this.zzi = zzejfVar;
        this.zzj = zzdxtVar;
        this.zzk = zzdxzVar;
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzduz zzduzVar = new zzduz();
        x7.e zza = zzgzo.zza(null);
        zzelz zzelzVar = new zzelz(this, zzfirVar, zzfjcVar, zzduzVar);
        Executor executor = this.zze;
        x7.e zzj = zzgzo.zzj(zza, zzelzVar, executor);
        zzj.addListener(new zzemb(zzduzVar), executor);
        return zzj;
    }

    public final /* synthetic */ x7.e zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) {
        zzemc zzemcVar;
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), R5.t.o().a());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzd;
        zzcjl zza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zza.zzaw(zzfirVar.zzW);
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), R5.t.o().a());
        }
        zzcen zzcenVar = new zzcen();
        zzdlu zzdluVar = this.zzc;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Context context = this.zza;
        W5.a aVar = this.zzf;
        boolean z = this.zzh;
        zzbok zzbokVar = this.zzg;
        zzdko zzd = zzdluVar.zzd(zzcwvVar, new zzdkr(new zzema(context, aVar, zzcenVar, zzfirVar, zza, zzfjkVar, z, zzbokVar, this.zzi, this.zzk), zza));
        zzcenVar.zzc(zzd);
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            zzemcVar = this;
            zzemcVar.zzj.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), R5.t.o().a());
        } else {
            zzemcVar = this;
        }
        zzd.zzd().zzq(new zzelx(zza), zzcei.zzg);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && zzd.zzl().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzduu zzk = zzd.zzk();
        zzbok zzbokVar2 = true != z ? null : zzbokVar;
        zzdxt zzdxtVar = zzemcVar.zzj;
        zzk.zzi(zza, true, zzbokVar2, zzdxtVar.zze());
        zzd.zzk();
        return zzgzo.zzk(zzduu.zzj(zza, zzfiwVar.zzb, str, zzdxtVar.zze(), zzdluVar.zzc()), new zzely(zzemcVar, zza, zzfirVar, zzd), zzemcVar.zze);
    }
}
