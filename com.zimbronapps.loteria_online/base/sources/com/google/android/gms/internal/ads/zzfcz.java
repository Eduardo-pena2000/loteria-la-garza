package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfcz implements zzfax {
    final ScheduledExecutorService zza;

    public zzfcz(zzbxw zzbxwVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    public final x7.e zza() {
        return zzgzo.zzk(zzgzo.zzi(zzgzo.zza(new Bundle()), ((Long) S5.D.c().zzd(zzbhe.zzfd)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfcy.zza, zzcei.zza);
    }

    public final int zzb() {
        return 49;
    }
}
