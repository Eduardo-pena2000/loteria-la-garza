package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzduu {
    private final zzdbd zza;
    private final zzdjk zzb;
    private final zzdcm zzc;
    private final zzdcz zzd;
    private final zzddq zze;
    private final zzdgj zzf;
    private final Executor zzg;
    private final zzdjg zzh;
    private final zzcss zzi;
    private final R5.b zzj;
    private final zzcce zzk;
    private final zzazh zzl;
    private final zzdga zzm;
    private final zzeiu zzn;
    private final zzfqk zzo;
    private final zzdxz zzp;
    private final zzcrv zzq;
    private final zzdva zzr;
    private final zzdzc zzs;
    private final zzdae zzt;
    private final zzczz zzu;

    public zzduu(zzdbd zzdbdVar, zzdcm zzdcmVar, zzdcz zzdczVar, zzddq zzddqVar, zzdgj zzdgjVar, Executor executor, zzdjg zzdjgVar, zzcss zzcssVar, R5.b bVar, zzcce zzcceVar, zzazh zzazhVar, zzdga zzdgaVar, zzeiu zzeiuVar, zzfqk zzfqkVar, zzdxz zzdxzVar, zzdjk zzdjkVar, zzcrv zzcrvVar, zzdva zzdvaVar, zzdzc zzdzcVar, zzdae zzdaeVar, zzczz zzczzVar) {
        this.zza = zzdbdVar;
        this.zzc = zzdcmVar;
        this.zzd = zzdczVar;
        this.zze = zzddqVar;
        this.zzf = zzdgjVar;
        this.zzg = executor;
        this.zzh = zzdjgVar;
        this.zzi = zzcssVar;
        this.zzj = bVar;
        this.zzk = zzcceVar;
        this.zzl = zzazhVar;
        this.zzm = zzdgaVar;
        this.zzn = zzeiuVar;
        this.zzo = zzfqkVar;
        this.zzp = zzdxzVar;
        this.zzb = zzdjkVar;
        this.zzq = zzcrvVar;
        this.zzr = zzdvaVar;
        this.zzs = zzdzcVar;
        this.zzt = zzdaeVar;
        this.zzu = zzczzVar;
    }

    public static final x7.e zzj(zzcjl zzcjlVar, String str, String str2, Bundle bundle, zzfoo zzfooVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcN)).booleanValue()) {
            bundle.putLong(zzdxh.zzG.zza(), R5.t.o().a());
        }
        zzcen zzcenVar = new zzcen();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkm)).booleanValue()) {
            zzfoe zzn = zzfoe.zzn(zzcjlVar.getContext(), 112);
            zzn.zza();
            zzfon.zzd(zzcenVar, zzfooVar, zzn);
        }
        zzcjlVar.zzP().zzG(new zzdus(bundle, zzcenVar));
        zzcjlVar.zzau(str, str2, null);
        return zzcenVar;
    }

    public final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    public final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzly)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final /* synthetic */ void zze(View view) {
        this.zzj.a();
    }

    public final /* synthetic */ void zzf(zzcjl zzcjlVar, zzcjl zzcjlVar2, Map map) {
        this.zzi.zzn(zzcjlVar);
    }

    public final /* synthetic */ zzdcm zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzdga zzh() {
        return this.zzm;
    }

    public final void zzi(zzcjl zzcjlVar, boolean z, zzbok zzbokVar, Bundle bundle) {
        zzazc zzb;
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            bundle.putLong(zzdxh.zzE.zza(), R5.t.o().a());
        }
        zzcjlVar.zzP().zzab(new zzdut(this), this.zzd, this.zze, new zzdum(this), new zzdun(this), z, zzbokVar, this.zzj, new zzdul(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt, this.zzu);
        zzcjlVar.setOnTouchListener(new zzduo(this));
        zzcjlVar.setOnClickListener(new zzdup(this));
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdq)).booleanValue() && (zzb = this.zzl.zzb()) != null) {
            zzb.zzh(zzcjlVar.zzE());
        }
        zzdjg zzdjgVar = this.zzh;
        Executor executor = this.zzg;
        zzdjgVar.zzq(zzcjlVar, executor);
        zzdjgVar.zzq(new zzduq(zzcjlVar), executor);
        zzdjgVar.zza(zzcjlVar.zzE());
        zzcjlVar.zzab("/trackActiveViewUnit", new zzdur(this, zzcjlVar));
        this.zzi.zzo(zzcjlVar);
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            bundle.putLong(zzdxh.zzF.zza(), R5.t.o().a());
        }
    }
}
