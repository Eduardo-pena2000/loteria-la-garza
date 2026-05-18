package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzadd implements Runnable {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ long zzc;

    public /* synthetic */ zzadd(zzadl zzadlVar, int i, long j) {
        this.zza = zzadlVar;
        this.zzb = i;
        this.zzc = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
