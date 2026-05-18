package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgcx implements Callable {
    private final /* synthetic */ zzgdb zza;
    private final /* synthetic */ Object zzb;

    public /* synthetic */ zzgcx(zzgdb zzgdbVar, Object obj) {
        this.zza = zzgdbVar;
        this.zzb = obj;
    }

    public final /* synthetic */ Object call() {
        this.zza.zze(this.zzb);
        return null;
    }
}
