package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackErrorEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzpk implements Runnable {
    private final /* synthetic */ zzpm zza;
    private final /* synthetic */ PlaybackErrorEvent zzb;

    public /* synthetic */ zzpk(zzpm zzpmVar, PlaybackErrorEvent playbackErrorEvent) {
        this.zza = zzpmVar;
        this.zzb = playbackErrorEvent;
    }

    public final /* synthetic */ void run() {
        this.zza.zzr(this.zzb);
    }
}
