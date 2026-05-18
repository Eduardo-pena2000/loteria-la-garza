package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhac extends zzgzj implements zzgzx {
    private final ScheduledFuture zza;

    public zzhac(x7.e eVar, ScheduledFuture scheduledFuture) {
        super(eVar);
        this.zza = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = zza().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zza.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
