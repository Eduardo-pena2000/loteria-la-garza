package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzaao implements Runnable {
    private final /* synthetic */ zzaap zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ long zzd;

    public /* synthetic */ zzaao(zzaap zzaapVar, int i, long j, long j2) {
        this.zza = zzaapVar;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzc().zzX(this.zzb, this.zzc, this.zzd);
    }
}
