package com.google.android.gms.internal.ads;

import android.media.metrics.NetworkEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzpg implements Runnable {
    private final /* synthetic */ zzpm zza;
    private final /* synthetic */ NetworkEvent zzb;

    public /* synthetic */ zzpg(zzpm zzpmVar, NetworkEvent networkEvent) {
        this.zza = zzpmVar;
        this.zzb = networkEvent;
    }

    public final /* synthetic */ void run() {
        this.zza.zzs(this.zzb);
    }
}
