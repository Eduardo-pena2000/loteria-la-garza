package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgzi extends zzgtw implements Future {
    public boolean cancel(boolean z) {
        return zza().cancel(z);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return zza().get();
    }

    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    public final boolean isDone() {
        return zza().isDone();
    }

    public abstract Future zza();

    public /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zza().get(j, timeUnit);
    }
}
