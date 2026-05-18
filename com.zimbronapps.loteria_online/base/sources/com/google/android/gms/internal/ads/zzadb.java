package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzadb implements Runnable {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ long zzd;

    public /* synthetic */ zzadb(zzadl zzadlVar, String str, long j, long j2) {
        this.zza = zzadlVar;
        this.zzb = str;
        this.zzc = j;
        this.zzd = j2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzl(this.zzb, this.zzc, this.zzd);
    }
}
