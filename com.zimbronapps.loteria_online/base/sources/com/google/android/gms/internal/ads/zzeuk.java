package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeuk implements zzfax {
    final zzcdu zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgzy zzd;
    private final Context zze;

    public zzeuk(Context context, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzdO)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcduVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgzyVar;
    }

    public final x7.e zza() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzdK)).booleanValue()) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzdP)).booleanValue()) {
                if (!((Boolean) S5.D.c().zzd(zzbhe.zzdL)).booleanValue()) {
                    return zzgzo.zzk(zzgat.zza(this.zzb.getAppSetIdInfo(), null), zzeuj.zza, zzcei.zzg);
                }
                Task zzb = ((Boolean) S5.D.c().zzd(zzbhe.zzdO)).booleanValue() ? zzfkp.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (zzb == null) {
                    return zzgzo.zza(new zzeul(null, -1));
                }
                x7.e zzj = zzgzo.zzj(zzgat.zza(zzb, null), zzeuh.zza, zzcei.zzg);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzdM)).booleanValue()) {
                    zzj = zzgzo.zzi(zzj, ((Long) S5.D.c().zzd(zzbhe.zzdN)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgzo.zzg(zzj, Exception.class, new zzeui(this), this.zzd);
            }
        }
        return zzgzo.zza(new zzeul(null, -1));
    }

    public final int zzb() {
        return 11;
    }
}
