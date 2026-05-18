package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzabk implements zzabl {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdr zzb;

    public zzabk(Executor executor, zzdr zzdrVar) {
        this.zza = executor;
        this.zzb = zzdrVar;
    }

    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
