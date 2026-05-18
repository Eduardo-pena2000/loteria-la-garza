package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcte implements zzbdy {
    private final ScheduledExecutorService zza;
    private final E6.f zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcte(ScheduledExecutorService scheduledExecutorService, E6.f fVar) {
        this.zza = scheduledExecutorService;
        this.zzb = fVar;
        R5.t.k().zzb(this);
    }

    public final void zza(boolean z) {
        if (z) {
            zzd();
        } else {
            zzc();
        }
    }

    public final synchronized void zzb(int i, Runnable runnable) {
        this.zzf = runnable;
        long j = i;
        this.zzd = this.zzb.b() + j;
        this.zzc = this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zzc() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                this.zze = this.zzd - this.zzb.b();
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
