package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzehm implements Callable {
    private final /* synthetic */ zzehj zza;

    public /* synthetic */ zzehm(zzehj zzehjVar) {
        this.zza = zzehjVar;
    }

    public final /* synthetic */ Object call() {
        return this.zza.getWritableDatabase();
    }
}
