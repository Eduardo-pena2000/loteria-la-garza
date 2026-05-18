package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzhab implements Executor {
    private final /* synthetic */ Executor zza;
    private final /* synthetic */ zzgyh zzb;

    public /* synthetic */ zzhab(Executor executor, zzgyh zzgyhVar) {
        this.zza = executor;
        this.zzb = zzgyhVar;
    }

    public final /* synthetic */ void execute(Runnable runnable) {
        zzhaf.zze(this.zza, this.zzb, runnable);
    }
}
