package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zztr implements Runnable {
    private final /* synthetic */ zztv zza;
    private final /* synthetic */ Runnable zzb;

    public /* synthetic */ zztr(zztv zztvVar, Runnable runnable) {
        this.zza = zztvVar;
        this.zzb = runnable;
    }

    public final /* synthetic */ void run() {
        this.zza.zzs(this.zzb);
    }
}
