package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcpg implements Runnable {
    private final /* synthetic */ zzcpj zza;
    private final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcpg(zzcpj zzcpjVar, Runnable runnable) {
        this.zza = zzcpjVar;
        this.zzb = runnable;
    }

    public final /* synthetic */ void run() {
        zzcei.zzf.execute(new zzcph(this.zza, this.zzb));
    }
}
