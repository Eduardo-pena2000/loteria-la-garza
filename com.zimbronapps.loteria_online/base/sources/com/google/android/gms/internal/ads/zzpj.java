package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackMetrics;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzpj implements Runnable {
    private final /* synthetic */ zzpm zza;
    private final /* synthetic */ PlaybackMetrics zzb;

    public /* synthetic */ zzpj(zzpm zzpmVar, PlaybackMetrics playbackMetrics) {
        this.zza = zzpmVar;
        this.zzb = playbackMetrics;
    }

    public final /* synthetic */ void run() {
        this.zza.zzv(this.zzb);
    }
}
