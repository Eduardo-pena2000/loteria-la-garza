package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcrt implements Runnable {
    private final /* synthetic */ zzcrv zza;
    private final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcrt(zzcrv zzcrvVar, Throwable th) {
        this.zza = zzcrvVar;
        this.zzb = th;
    }

    public final /* synthetic */ void run() {
        this.zza.zzh(this.zzb);
    }
}
