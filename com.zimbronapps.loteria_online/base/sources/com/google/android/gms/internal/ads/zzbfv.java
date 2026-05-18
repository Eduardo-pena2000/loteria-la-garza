package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbfv implements Runnable {
    private final /* synthetic */ zzcen zza;
    private final /* synthetic */ Future zzb;

    public /* synthetic */ zzbfv(zzcen zzcenVar, Future future) {
        this.zza = zzcenVar;
        this.zzb = future;
    }

    public final /* synthetic */ void run() {
        if (this.zza.isCancelled()) {
            this.zzb.cancel(true);
        }
    }
}
