package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzffb implements zzgzl {
    final /* synthetic */ zzfoo zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ zzcvc zzc;
    final /* synthetic */ zzfff zzd;

    public zzffb(zzfff zzfffVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzcvc zzcvcVar) {
        this.zza = zzfooVar;
        this.zzb = zzfoeVar;
        this.zzc = zzcvcVar;
        Objects.requireNonNull(zzfffVar);
        this.zzd = zzfffVar;
    }

    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgK)).booleanValue()) {
            o0.l("Banner ad failed to load", th);
        }
        zzfff zzfffVar = this.zzd;
        synchronized (zzfffVar) {
            try {
                zzcvc zzcvcVar = this.zzc;
                c1 zzg = zzcvcVar.zzc().zzg(th);
                zzfffVar.zzs(zzg);
                zzcvcVar.zzb().zzdI(zzg);
                zzfkh.zza(zzg.a, th, "BannerAdLoader.onFailure");
                if (zzfffVar.zzr()) {
                    zzfffVar.zzn();
                    zzfffVar.zzo().zzd(zzfffVar.zzq().zzc());
                }
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                    zzfor zzp = zzfffVar.zzp();
                    zzfoe zzfoeVar = this.zzb;
                    zzfoeVar.zzh(zzg);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzp.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzg);
                    zzfoe zzfoeVar2 = this.zzb;
                    zzfoeVar2.zzj(th);
                    zzfoeVar2.zzd(false);
                    zzfooVar.zza(zzfoeVar2);
                    zzfooVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzfff zzfffVar = this.zzd;
        zzctx zzctxVar = (zzctx) obj;
        synchronized (zzfffVar) {
            if (zzctxVar != null) {
                try {
                    zzctxVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfffVar.zzr()) {
                zzfffVar.zzc();
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zza) == null) {
                zzfor zzp = zzfffVar.zzp();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzg(zzctxVar.zzr().zzb);
                zzfoeVar.zzi(zzctxVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzp.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzctxVar.zzr().zzb);
                zzfooVar.zzg(zzctxVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzb;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
