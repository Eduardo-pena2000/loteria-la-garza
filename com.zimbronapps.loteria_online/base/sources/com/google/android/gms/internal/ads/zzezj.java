package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzezj implements zzfax {
    private final zzfax zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzezj(zzfax zzfaxVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfaxVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public final x7.e zza() {
        x7.e zza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcV)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zza = zzgzo.zzi(zza, j, timeUnit, this.zzc);
        }
        return zzgzo.zzh(zza, Throwable.class, new zzezi(this), zzcei.zzg);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final /* synthetic */ x7.e zzc(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcT)).booleanValue()) {
            zzfax zzfaxVar = this.zza;
            zzcdu l = R5.t.l();
            int zzb = zzfaxVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            l.zzg(th, sb.toString());
        }
        return zzgzo.zza(null);
    }
}
