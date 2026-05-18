package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzarn implements Executor {
    final /* synthetic */ Handler zza;

    public zzarn(zzarp zzarpVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzarpVar);
    }

    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
