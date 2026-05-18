package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzqt implements Runnable {
    private final /* synthetic */ zzrb zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ long zzd;

    public /* synthetic */ zzqt(zzrb zzrbVar, int i, long j, long j2) {
        this.zza = zzrbVar;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzs(this.zzb, this.zzc, this.zzd);
    }
}
