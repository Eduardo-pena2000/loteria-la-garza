package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzchz implements Runnable {
    private final /* synthetic */ zzcge zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ long zzc;

    public /* synthetic */ zzchz(zzcge zzcgeVar, boolean z, long j) {
        this.zza = zzcgeVar;
        this.zzb = z;
        this.zzc = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzu(this.zzb, this.zzc);
    }
}
