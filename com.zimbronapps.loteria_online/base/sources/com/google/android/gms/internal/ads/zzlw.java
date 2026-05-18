package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzlw implements Runnable {
    private final /* synthetic */ zzlx zza;
    private final /* synthetic */ Pair zzb;
    private final /* synthetic */ zzwb zzc;
    private final /* synthetic */ zzwg zzd;
    private final /* synthetic */ int zze;

    public /* synthetic */ zzlw(zzlx zzlxVar, Pair pair, zzwb zzwbVar, zzwg zzwgVar, int i) {
        this.zza = zzlxVar;
        this.zzb = pair;
        this.zzc = zzwbVar;
        this.zzd = zzwgVar;
        this.zze = i;
    }

    public final /* synthetic */ void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzwk) pair.second, this.zzc, this.zzd, this.zze);
    }
}
