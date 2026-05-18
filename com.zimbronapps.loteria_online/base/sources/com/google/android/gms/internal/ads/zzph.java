package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackStateEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzph implements Runnable {
    private final /* synthetic */ zzpm zza;
    private final /* synthetic */ PlaybackStateEvent zzb;

    public /* synthetic */ zzph(zzpm zzpmVar, PlaybackStateEvent playbackStateEvent) {
        this.zza = zzpmVar;
        this.zzb = playbackStateEvent;
    }

    public final /* synthetic */ void run() {
        this.zza.zzt(this.zzb);
    }
}
