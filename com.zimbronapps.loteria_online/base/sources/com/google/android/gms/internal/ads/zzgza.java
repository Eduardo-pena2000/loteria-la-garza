package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgza extends zzgzb {
    final /* synthetic */ zzgzc zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgza(zzgzc zzgzcVar, Callable callable, Executor executor) {
        super(zzgzcVar, executor);
        Objects.requireNonNull(zzgzcVar);
        this.zza = zzgzcVar;
        this.zzc = callable;
    }

    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    public final String zzc() {
        return this.zzc.toString();
    }
}
