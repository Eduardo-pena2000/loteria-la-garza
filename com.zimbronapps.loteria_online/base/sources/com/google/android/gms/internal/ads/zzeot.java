package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeot implements zzekg {
    private final Context zza;
    private final zzduv zzb;
    private final zzdue zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final W5.a zzf;
    private final zzbok zzg;
    private final boolean zzh = ((Boolean) S5.D.c().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzi;
    private final zzdxt zzj;
    private final zzdxz zzk;

    public zzeot(Context context, W5.a aVar, zzfjk zzfjkVar, Executor executor, zzdue zzdueVar, zzduv zzduvVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzd = zzfjkVar;
        this.zzc = zzdueVar;
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
        zzeos zzeosVar = new zzeos(this, zzfirVar, zzfjcVar, zzduzVar);
        Executor executor = this.zze;
        x7.e zzj = zzgzo.zzj(zza, zzeosVar, executor);
        zzj.addListener(new zzeom(zzduzVar), executor);
        return zzj;
    }

    public final /* synthetic */ x7.e zzc(zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) {
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
        zzdue zzdueVar = this.zzc;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Context context = this.zza;
        W5.a aVar = this.zzf;
        zzbok zzbokVar = this.zzg;
        boolean z = this.zzh;
        zzejf zzejfVar = this.zzi;
        zzdxt zzdxtVar = this.zzj;
        zzdua zzf = zzdueVar.zzf(zzcwvVar, new zzdub(new zzeop(context, zzduvVar, zzfjkVar, aVar, zzfirVar, zzcenVar, zza, zzbokVar, z, zzejfVar, zzdxtVar, this.zzk), zza));
        zzcenVar.zzc(zzf);
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            zzdxtVar.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), R5.t.o().a());
        }
        zzbpa.zzb(zza, zzf.zzk());
        zzf.zzd().zzq(new zzeoq(zza), zzcei.zzg);
        zzf.zzl().zzi(zza, true, true != z ? null : zzbokVar, zzdxtVar.zze());
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzo().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzl();
        return zzgzo.zzk(zzduu.zzj(zza, zzfiwVar.zzb, str, zzdxtVar.zze(), zzdueVar.zzd()), new zzeor(this, zza, zzfirVar, zzf), this.zze);
    }
}
