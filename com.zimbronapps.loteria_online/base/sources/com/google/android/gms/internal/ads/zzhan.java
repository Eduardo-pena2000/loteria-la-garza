package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhan extends zzgzf implements RunnableFuture {
    private volatile zzgzv zza;

    public zzhan(zzgyv zzgyvVar) {
        this.zza = new zzhal(this, zzgyvVar);
    }

    public static zzhan zze(Runnable runnable, Object obj) {
        return new zzhan(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar != null) {
            zzgzvVar.run();
        }
        this.zza = null;
    }

    public final void zzc() {
        zzgzv zzgzvVar;
        if (zzj() && (zzgzvVar = this.zza) != null) {
            zzgzvVar.zzh();
        }
        this.zza = null;
    }

    public final String zzd() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar == null) {
            return super.zzd();
        }
        String obj = zzgzvVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public zzhan(Callable callable) {
        this.zza = new zzham(this, callable);
    }
}
