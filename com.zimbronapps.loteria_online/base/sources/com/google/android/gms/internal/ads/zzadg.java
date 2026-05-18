package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzadg implements Runnable {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ Object zzb;
    private final /* synthetic */ long zzc;

    public /* synthetic */ zzadg(zzadl zzadlVar, Object obj, long j) {
        this.zza = zzadlVar;
        this.zzb = obj;
        this.zzc = j;
    }

    public final /* synthetic */ void run() {
        this.zza.zzq(this.zzb, this.zzc);
    }
}
