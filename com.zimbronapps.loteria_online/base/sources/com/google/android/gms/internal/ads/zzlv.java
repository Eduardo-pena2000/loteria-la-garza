package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzlv implements Runnable {
    private final /* synthetic */ zzlx zza;
    private final /* synthetic */ Pair zzb;
    private final /* synthetic */ zzwg zzc;

    public /* synthetic */ zzlv(zzlx zzlxVar, Pair pair, zzwg zzwgVar) {
        this.zza = zzlxVar;
        this.zzb = pair;
        this.zzc = zzwgVar;
    }

    public final /* synthetic */ void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzwk) pair.second, this.zzc);
    }
}
