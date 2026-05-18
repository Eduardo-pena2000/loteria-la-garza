package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfbp implements Runnable {
    private final /* synthetic */ Throwable zza;

    public /* synthetic */ zzfbp(Throwable th) {
        this.zza = th;
    }

    public final /* synthetic */ void run() {
        boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzlS)).booleanValue();
        Throwable th = this.zza;
        if (booleanValue) {
            R5.t.l().zzi(th, "TopicsSignalUnsampled.fetchTopicsSignal");
        } else {
            R5.t.l().zzh(th, "TopicsSignal.fetchTopicsSignal");
        }
    }
}
