package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfmv implements Runnable {
    private final /* synthetic */ zzfmx zza;

    public /* synthetic */ zzfmv(zzfmx zzfmxVar) {
        this.zza = zzfmxVar;
    }

    public final /* synthetic */ void run() {
        zzfmx zzfmxVar;
        zzfmx zzfmxVar2 = this.zza;
        zzfmy zzfmyVar = zzfmxVar2.zzd;
        synchronized (zzfmyVar) {
            try {
                ScheduledFuture scheduledFuture = zzfmxVar2.zzc;
                zzfmxVar = scheduledFuture != null ? (zzfmx) zzfmyVar.zze().remove(scheduledFuture) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzfmxVar != null) {
            zzfmxVar2.zzd.zzd().execute(zzfmxVar2.zza);
        }
    }
}
