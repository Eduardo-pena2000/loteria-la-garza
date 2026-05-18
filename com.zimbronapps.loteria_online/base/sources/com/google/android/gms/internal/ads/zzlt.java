package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzlt implements Runnable {
    private final /* synthetic */ zzlx zza;
    private final /* synthetic */ Pair zzb;
    private final /* synthetic */ zzwb zzc;
    private final /* synthetic */ zzwg zzd;

    public /* synthetic */ zzlt(zzlx zzlxVar, Pair pair, zzwb zzwbVar, zzwg zzwgVar) {
        this.zza = zzlxVar;
        this.zzb = pair;
        this.zzc = zzwbVar;
        this.zzd = zzwgVar;
    }

    public final /* synthetic */ void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzwk) pair.second, this.zzc, this.zzd);
    }
}
