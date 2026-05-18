package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfmx {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfmy zzd;

    public zzfmx(zzfmy zzfmyVar, Runnable runnable, long j) {
        Objects.requireNonNull(zzfmyVar);
        this.zzd = zzfmyVar;
        this.zza = runnable;
        this.zzb = j;
    }
}
