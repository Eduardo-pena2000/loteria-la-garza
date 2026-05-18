package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcjr implements Runnable {
    private final /* synthetic */ zzcjw zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ long zzc;

    public /* synthetic */ zzcjr(zzcjw zzcjwVar, boolean z, long j) {
        this.zza = zzcjwVar;
        this.zzb = z;
        this.zzc = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzY(this.zzb, this.zzc);
    }
}
