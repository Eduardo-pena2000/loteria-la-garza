package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcrs implements Runnable {
    private final /* synthetic */ zzcrv zza;
    private final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcrs(zzcrv zzcrvVar, Throwable th) {
        this.zza = zzcrvVar;
        this.zzb = th;
    }

    public final /* synthetic */ void run() {
        this.zza.zzg(this.zzb);
    }
}
