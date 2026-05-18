package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzesj implements zzgzl {
    final /* synthetic */ zzese zza;
    final /* synthetic */ zzfoo zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzdmq zzd;
    final /* synthetic */ zzesm zze;

    public zzesj(zzesm zzesmVar, zzese zzeseVar, zzfoo zzfooVar, zzfoe zzfoeVar, zzdmq zzdmqVar) {
        this.zza = zzeseVar;
        this.zzb = zzfooVar;
        this.zzc = zzfoeVar;
        this.zzd = zzdmqVar;
        Objects.requireNonNull(zzesmVar);
        this.zze = zzesmVar;
    }

    public final void zza(Throwable th) {
        zzfoo zzfooVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgK)).booleanValue()) {
            o0.l("Native ad failed to load", th);
        }
        zzdmq zzdmqVar = this.zzd;
        c1 zzg = zzdmqVar.zza().zzg(th);
        zzdmqVar.zzb().zzdI(zzg);
        zzesm zzesmVar = this.zze;
        zzesmVar.zze().zzb().execute(new zzesh(this, zzg));
        zzfkh.zza(zzg.a, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
            zzfor zzg2 = zzesmVar.zzg();
            zzfoe zzfoeVar = this.zzc;
            zzfoeVar.zzh(zzg);
            zzfoeVar.zzj(th);
            zzfoeVar.zzd(false);
            zzg2.zzb(zzfoeVar.zzm());
            return;
        }
        zzfooVar.zzf(zzg);
        zzfoe zzfoeVar2 = this.zzc;
        zzfoeVar2.zzj(th);
        zzfoeVar2.zzd(false);
        zzfooVar.zza(zzfoeVar2);
        zzfooVar.zzh();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfoo zzfooVar;
        zzesm zzesmVar = this.zze;
        zzcwf zzcwfVar = (zzcwf) obj;
        synchronized (zzesmVar) {
            if (zzcwfVar != null) {
                try {
                    zzcwfVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcwfVar.zzq().zza(zzesmVar.zzf().zzc());
            this.zza.zzb(zzcwfVar);
            zzesmVar.zze().zzb().execute(new zzesi(this));
            if (!((Boolean) zzbix.zzc.zze()).booleanValue() || (zzfooVar = this.zzb) == null) {
                zzfor zzg = zzesmVar.zzg();
                zzfoe zzfoeVar = this.zzc;
                zzfoeVar.zzg(zzcwfVar.zzr().zzb);
                zzfoeVar.zzi(zzcwfVar.zzn().zze());
                zzfoeVar.zzd(true);
                zzg.zzb(zzfoeVar.zzm());
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
