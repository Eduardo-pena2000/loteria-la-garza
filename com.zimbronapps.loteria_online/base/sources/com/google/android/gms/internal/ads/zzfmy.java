package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfmy implements zzbdy {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    public zzfmy(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
            zzfmx zzfmxVar = (zzfmx) map.get(scheduledFuture);
            if (zzfmxVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                zzb(zzfmxVar.zza, Math.max(0L, zzfmxVar.zzb - R5.t.o().a()), TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void zza(boolean z) {
        if (z) {
            this.zzb.execute(new zzfmw(this));
        }
    }

    public final synchronized void zzb(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            if (!this.zzd) {
                R5.t.k().zzb(this);
                this.zzd = true;
            }
            zzfmx zzfmxVar = new zzfmx(this, runnable, R5.t.o().a() + timeUnit.toMillis(j));
            ScheduledFuture schedule = this.zza.schedule(new zzfmv(zzfmxVar), j, timeUnit);
            zzfmxVar.zzc = schedule;
            this.zzc.put(schedule, zzfmxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
