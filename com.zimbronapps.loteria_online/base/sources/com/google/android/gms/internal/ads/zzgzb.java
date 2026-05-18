package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgzb extends zzgzv {
    private final Executor zza;
    final /* synthetic */ zzgzc zzb;

    public zzgzb(zzgzc zzgzcVar, Executor executor) {
        Objects.requireNonNull(zzgzcVar);
        this.zzb = zzgzcVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzb(e);
        }
    }

    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    public final void zzg(Throwable th) {
        zzgzc zzgzcVar = this.zzb;
        zzgzcVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzgzcVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzgzcVar.cancel(false);
        } else {
            zzgzcVar.zzb(th);
        }
    }
}
