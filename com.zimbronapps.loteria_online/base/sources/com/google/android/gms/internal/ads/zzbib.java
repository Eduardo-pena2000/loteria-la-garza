package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbib implements Runnable {
    private final /* synthetic */ zzbid zza;
    private final /* synthetic */ int zzb;

    public /* synthetic */ zzbib(zzbid zzbidVar, int i) {
        this.zza = zzbidVar;
        this.zzb = i;
    }

    public final /* synthetic */ void run() {
        this.zza.zze(this.zzb);
    }
}
