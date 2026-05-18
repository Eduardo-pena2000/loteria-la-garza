package com.google.android.gms.internal.ads;

import S5.e2;
import S5.q2;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzelg implements zzekg {
    private final zzcvc zza;
    private final Context zzb;
    private final zzduv zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final zzgqt zzf;
    private final zzdxt zzg;

    public zzelg(zzcvc zzcvcVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, zzgqt zzgqtVar, zzdxt zzdxtVar) {
        this.zzb = context;
        this.zza = zzcvcVar;
        this.zze = executor;
        this.zzc = zzduvVar;
        this.zzd = zzfjkVar;
        this.zzf = zzgqtVar;
        this.zzg = zzdxtVar;
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        return zzgzo.zzj(zzgzo.zza(null), new zzelf(this, zzfjcVar, zzfirVar), this.zze);
    }

    public final /* synthetic */ x7.e zzc(zzfjc zzfjcVar, zzfir zzfirVar, Object obj) {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), R5.t.o().a());
        }
        Context context = this.zzb;
        q2 zza = zzfjq.zza(context, zzfirVar.zzu);
        zzcjl zza2 = this.zzc.zza(zza, zzfirVar, zzfjcVar.zzb.zzb);
        zza2.zzaw(zzfirVar.zzW);
        View zza3 = (((Boolean) S5.D.c().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) ? zzcvr.zza(context, zza2.zzE(), zzfirVar) : new zzduy(context, zza2.zzE(), (V5.u) this.zzf.apply(zzfirVar));
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), R5.t.o().a());
        }
        zzcvc zzcvcVar = this.zza;
        zzcty zzf = zzcvcVar.zzf(new zzcwv(zzfjcVar, zzfirVar, null), new zzcue(zza3, zza2, new zzelb(zza2), zzfjq.zzb(zza)));
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), R5.t.o().a());
        }
        zzduu zzj = zzf.zzj();
        zzdxt zzdxtVar = this.zzg;
        zzj.zzi(zza2, false, null, zzdxtVar.zze());
        zzdbx zzd = zzf.zzd();
        zzelc zzelcVar = new zzelc(zza2);
        zzgzy zzgzyVar = zzcei.zzg;
        zzd.zzq(zzelcVar, zzgzyVar);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzm().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzj();
        x7.e zzj2 = zzduu.zzj(zza2, zzfiwVar.zzb, str, zzdxtVar.zze(), zzcvcVar.zze());
        if (zzfirVar.zzM) {
            zzj2.addListener(new zzela(zza2), this.zze);
        }
        zzj2.addListener(new zzeld(this, zza2), this.zze);
        return zzgzo.zzk(zzj2, new zzele(zzf), zzgzyVar);
    }

    public final /* synthetic */ void zzd(zzcjl zzcjlVar) {
        zzcjlVar.zzJ();
        zzfjk zzfjkVar = this.zzd;
        zzckr zzh = zzcjlVar.zzh();
        e2 e2Var = zzfjkVar.zza;
        if (e2Var != null && zzh != null) {
            zzh.zzc(e2Var);
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzbP)).booleanValue() || zzcjlVar.isAttachedToWindow()) {
            return;
        }
        zzcjlVar.onPause();
        zzcjlVar.zzaG(true);
    }
}
