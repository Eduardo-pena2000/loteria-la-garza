package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfdx implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzfdy zzd;
    final /* synthetic */ zzfeb zze;

    public zzfdx(zzfeb zzfebVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfdy zzfdyVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfdyVar;
        Objects.requireNonNull(zzfebVar);
        this.zze = zzfebVar;
    }

    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgK)).booleanValue()) {
            o0.l("App open ad failed to load", th);
        }
        zzfeb zzfebVar = this.zze;
        zzcth zzcthVar = (zzcth) zzfebVar.zzj().zzd();
        c1 zzb = zzcthVar == null ? zzfkm.zzb(th, null) : zzcthVar.zza().zzg(th);
        synchronized (zzfebVar) {
            try {
                zzfebVar.zzl(null);
                if (zzcthVar != null) {
                    zzcthVar.zze().zzdI(zzb);
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzjx)).booleanValue()) {
                        zzfebVar.zzh().execute(new zzfdw(this, zzb));
                    }
                } else {
                    zzfebVar.zzi().zzdI(zzb);
                    ((zzcth) zzfebVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfkh.zza(zzb.a, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzk = zzfebVar.zzk();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzb);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzk.zzb(zzfoeVar.zzm());
                } else {
                    zzfooVar.zzf(zzb);
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
        zzfeb zzfebVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzfebVar) {
            if (zzcwfVar != null) {
                try {
                    zzcwfVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfebVar.zzl(null);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzjx)).booleanValue()) {
                zzcwfVar.zzq().zzc(zzfebVar.zzi());
            }
            this.zza.zzb(zzcwfVar);
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzk = zzfebVar.zzk();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                zzfoeVar.zzi(zzcwfVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzk.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzcwfVar.zzr().zzb);
                zzfooVar.zzg(zzcwfVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
