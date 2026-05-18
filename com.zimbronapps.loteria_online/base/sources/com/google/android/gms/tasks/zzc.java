package com.google.android.gms.tasks;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    public final void run() {
        Task task = this.zza;
        if (task.isCanceled()) {
            this.zzb.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(this.zzb.zzc().then(task));
        } catch (Exception e) {
            this.zzb.zzd().zzc(e);
        } catch (RuntimeExecutionException e2) {
            if (!(e2.getCause() instanceof Exception)) {
                this.zzb.zzd().zzc(e2);
                return;
            }
            zzd zzdVar = this.zzb;
            zzdVar.zzd().zzc((Exception) e2.getCause());
        }
    }
}
