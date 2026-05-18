package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzrq implements Runnable {
    private final /* synthetic */ AudioTrack zza;
    private final /* synthetic */ Handler zzb;
    private final /* synthetic */ zzed zzc;

    public /* synthetic */ zzrq(AudioTrack audioTrack, Handler handler, zzed zzedVar) {
        this.zza = audioTrack;
        this.zzb = handler;
        this.zzc = zzedVar;
    }

    public final /* synthetic */ void run() {
        zzsd.zzp(this.zza, this.zzb, this.zzc);
    }
}
