package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzach implements Executor {
    private final /* synthetic */ zzdx zza;

    public /* synthetic */ zzach(zzdx zzdxVar) {
        this.zza = zzdxVar;
    }

    public final /* synthetic */ void execute(Runnable runnable) {
        this.zza.zzn(runnable);
    }
}
