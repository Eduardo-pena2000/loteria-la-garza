package com.google.android.gms.internal.ads;

import android.media.metrics.TrackChangeEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzpi implements Runnable {
    private final /* synthetic */ zzpm zza;
    private final /* synthetic */ TrackChangeEvent zzb;

    public /* synthetic */ zzpi(zzpm zzpmVar, TrackChangeEvent trackChangeEvent) {
        this.zza = zzpmVar;
        this.zzb = trackChangeEvent;
    }

    public final /* synthetic */ void run() {
        this.zza.zzu(this.zzb);
    }
}
