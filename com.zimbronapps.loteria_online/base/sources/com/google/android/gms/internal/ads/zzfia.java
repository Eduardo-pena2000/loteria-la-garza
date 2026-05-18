package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfia implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzfid zzd;
    final /* synthetic */ zzfie zze;

    public zzfia(zzfie zzfieVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzfid zzfidVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzfidVar;
        Objects.requireNonNull(zzfieVar);
        this.zze = zzfieVar;
    }

    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgK)).booleanValue()) {
            o0.l("Rewarded ad failed to load", th);
        }
        zzfie zzfieVar = this.zze;
        zzdue zzdueVar = (zzdue) zzfieVar.zzh().zzd();
        c1 zzb = zzdueVar == null ? zzfkm.zzb(th, null) : zzdueVar.zza().zzg(th);
        synchronized (zzfieVar) {
            try {
                if (zzdueVar != null) {
                    zzdueVar.zze().zzdI(zzb);
                    zzfieVar.zzf().execute(new zzfhz(this, zzb));
                } else {
                    zzfieVar.zzg().zzdI(zzb);
                    zzfieVar.zze(this.zzd).zza().zza().zzd().zzo();
                }
                zzfkh.zza(zzb.a, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                    zzfor zzi = zzfieVar.zzi();
                    zzfoe zzfoeVar = this.zzc;
                    zzfoeVar.zzh(zzb);
                    zzfoeVar.zzj(th);
                    zzfoeVar.zzd(false);
                    zzi.zzb(zzfoeVar.zzm());
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
        zzfie zzfieVar = this.zze;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfieVar) {
            if (zzdtzVar != null) {
                try {
                    zzdtzVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdtzVar.zzq().zzd(zzfieVar.zzg());
            this.zza.zzb(zzdtzVar);
            Executor zzf = zzfieVar.zzf();
            zzfhv zzg = zzfieVar.zzg();
            Objects.requireNonNull(zzg);
            zzf.execute(new zzfhy(zzg));
            zzfieVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzi = zzfieVar.zzi();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzdtzVar.zzr().zzb);
                zzfoeVar.zzi(zzdtzVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzi.zzb(zzfoeVar.zzm());
            } else {
                zzfooVar.zze(zzdtzVar.zzr().zzb);
                zzfooVar.zzg(zzdtzVar.zzn().zze());
                zzfoe zzfoeVar2 = this.zzc;
                zzfoeVar2.zzd(true);
                zzfooVar.zza(zzfoeVar2);
                zzfooVar.zzh();
            }
        }
    }
}
