package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzham extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final Callable zzb;

    public zzham(zzhan zzhanVar, Callable callable) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        callable.getClass();
        this.zzb = callable;
    }

    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    public final String zzc() {
        return this.zzb.toString();
    }

    public final boolean zzd() {
        return this.zza.isDone();
    }

    public final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
