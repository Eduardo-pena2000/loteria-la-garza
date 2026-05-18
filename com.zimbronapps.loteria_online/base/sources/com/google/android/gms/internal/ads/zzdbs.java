package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdbs extends zzdhd implements zzdbj {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzdbs(zzdbo zzdboVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        super.zzq(zzdboVar, executor);
    }

    public final synchronized void zza() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzb() {
        this.zzc = this.zzb.schedule(new zzdbq(this), ((Integer) S5.D.c().zzd(zzbhe.zzmg)).intValue(), TimeUnit.MILLISECONDS);
    }

    public final void zzc(c1 c1Var) {
        zzs(new zzdbr(c1Var));
    }

    public final void zzd(zzdmb zzdmbVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzs(new zzdbp(zzdmbVar));
    }

    public final void zze() {
        zzs(zzdbk.zza);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            int i = o0.b;
            W5.p.c("Timeout waiting for show call succeed to be called.");
            zzd(new zzdmb("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
