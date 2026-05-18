package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhak extends zzgzf {
    private x7.e zza;
    private ScheduledFuture zzb;

    private zzhak(x7.e eVar) {
        eVar.getClass();
        this.zza = eVar;
    }

    public static x7.e zze(x7.e eVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhak zzhakVar = new zzhak(eVar);
        zzhai zzhaiVar = new zzhai(zzhakVar);
        zzhakVar.zzb = scheduledExecutorService.schedule(zzhaiVar, j, timeUnit);
        eVar.addListener(zzhaiVar, zzgzd.INSTANCE);
        return zzhakVar;
    }

    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    public final String zzd() {
        x7.e eVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (eVar == null) {
            return null;
        }
        String obj = eVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 19 + String.valueOf(delay).length() + 4);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    public final /* synthetic */ x7.e zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
