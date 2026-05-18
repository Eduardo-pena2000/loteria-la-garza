package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfcg implements zzfax {
    private final zzcdu zza;
    private final ScheduledExecutorService zzb;
    private final zzgzy zzc;

    public zzfcg(String str, zzbfg zzbfgVar, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        this.zza = zzcduVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgzyVar;
    }

    public final x7.e zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdK)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzdP)).booleanValue()) {
                x7.e zza = zzgat.zza(Tasks.forResult((Object) null), null);
                zzgzy zzgzyVar = this.zzc;
                x7.e zzj = zzgzo.zzj(zza, zzfcf.zza, zzgzyVar);
                if (((Boolean) zzbir.zza.zze()).booleanValue()) {
                    zzj = zzgzo.zzi(zzj, ((Long) zzbir.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgzo.zzg(zzj, Exception.class, new zzfce(this), zzgzyVar);
            }
        }
        return zzgzo.zza(new zzfch(null, -1));
    }

    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzfch zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfch(null, -1);
    }
}
