package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcgu implements Runnable {
    private final /* synthetic */ zzcgw zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ long zzc;

    public /* synthetic */ zzcgu(zzcgw zzcgwVar, boolean z, long j) {
        this.zza = zzcgwVar;
        this.zzb = z;
        this.zzc = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzQ(this.zzb, this.zzc);
    }
}
