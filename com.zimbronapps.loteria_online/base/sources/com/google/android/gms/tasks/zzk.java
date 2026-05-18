package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.t;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzlVar);
        this.zzb = zzlVar;
    }

    public final void run() {
        zzl zzlVar = this.zzb;
        synchronized (zzlVar.zzc()) {
            try {
                if (zzlVar.zzd() != null) {
                    zzlVar.zzd().onFailure((Exception) t.l(this.zza.getException()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
