package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcjo implements Runnable {
    private final /* synthetic */ zzcjw zza;
    private final /* synthetic */ long zzb;

    public /* synthetic */ zzcjo(zzcjw zzcjwVar, boolean z, long j) {
        this.zza = zzcjwVar;
        this.zzb = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzV(true, this.zzb);
    }
}
