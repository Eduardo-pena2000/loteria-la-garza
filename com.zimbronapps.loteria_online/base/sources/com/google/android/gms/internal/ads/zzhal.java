package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhal extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final zzgyv zzb;

    public zzhal(zzhan zzhanVar, zzgyv zzgyvVar) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        this.zzb = zzgyvVar;
    }

    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgyv zzgyvVar = this.zzb;
        x7.e zza = zzgyvVar.zza();
        zzgrc.zzl(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgyvVar);
        return zza;
    }

    public final String zzc() {
        return this.zzb.toString();
    }

    public final boolean zzd() {
        return this.zza.isDone();
    }

    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((x7.e) obj);
    }

    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
