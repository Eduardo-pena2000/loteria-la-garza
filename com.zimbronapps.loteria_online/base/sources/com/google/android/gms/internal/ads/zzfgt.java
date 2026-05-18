package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfgt implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzdlu zzd;
    final /* synthetic */ zzfgv zze;

    public zzfgt(zzfgv zzfgvVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdlu zzdluVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdluVar;
        Objects.requireNonNull(zzfgvVar);
        this.zze = zzfgvVar;
    }

    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgK)).booleanValue()) {
            o0.l("Interstitial ad failed to load", th);
        }
        zzdlu zzdluVar = this.zzd;
        c1 zzg = zzdluVar.zzb().zzg(th);
        zzfgv zzfgvVar = this.zze;
        synchronized (zzfgvVar) {
            try {
                zzfgvVar.zzi(null);
                zzdluVar.zza().zzdI(zzg);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzjy)).booleanValue()) {
                    zzfgvVar.zze().execute(new zzfgq(this, zzg));
                    zzfgvVar.zze().execute(new zzfgr(this, zzg));
                }
                zzfkh.zza(zzg.a, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzh = zzfgvVar.zzh();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzg);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzh.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzg);
                    zzfoe zzfoeVar2 = this.zzc;
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
        zzfgv zzfgvVar = this.zze;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzfgvVar) {
            if (zzdknVar != null) {
                try {
                    zzdknVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfgvVar.zzi(null);
            zzbgv zzbgvVar = zzbhe.zzjy;
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                zzdev zzq = zzdknVar.zzq();
                zzq.zza(zzfgvVar.zzf());
                zzq.zzd(zzfgvVar.zzg());
            }
            this.zza.zzb(zzdknVar);
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                zzfgvVar.zze().execute(new zzfgs(this));
                zzfgvVar.zze().execute(new zzfgp(this));
            }
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzh = zzfgvVar.zzh();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzdknVar.zzr().zzb);
                zzfoeVar.zzi(zzdknVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzh.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzdknVar.zzr().zzb);
                zzfooVar.zzg(zzdknVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
