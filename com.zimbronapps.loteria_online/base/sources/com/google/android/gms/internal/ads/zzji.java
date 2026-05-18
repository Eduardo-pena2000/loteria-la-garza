package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzji implements Runnable {
    private final /* synthetic */ Context zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzks zzc;
    private final /* synthetic */ zzpq zzd;

    public /* synthetic */ zzji(Context context, boolean z, zzks zzksVar, zzpq zzpqVar) {
        this.zza = context;
        this.zzb = z;
        this.zzc = zzksVar;
        this.zzd = zzpqVar;
    }

    public final /* synthetic */ void run() {
        zzpm zza = zzpm.zza(this.zza);
        if (zza == null) {
            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return;
        }
        if (this.zzb) {
            this.zzc.zzD(zza);
        }
        this.zzd.zzb(zza.zzb());
    }
}
