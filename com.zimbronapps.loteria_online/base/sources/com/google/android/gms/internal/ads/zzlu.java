package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzlu implements Runnable {
    private final /* synthetic */ zzlx zza;
    private final /* synthetic */ Pair zzb;
    private final /* synthetic */ zzwb zzc;
    private final /* synthetic */ zzwg zzd;
    private final /* synthetic */ IOException zze;
    private final /* synthetic */ boolean zzf;

    public /* synthetic */ zzlu(zzlx zzlxVar, Pair pair, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        this.zza = zzlxVar;
        this.zzb = pair;
        this.zzc = zzwbVar;
        this.zzd = zzwgVar;
        this.zze = iOException;
        this.zzf = z;
    }

    public final /* synthetic */ void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzwk) pair.second, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
