package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzade implements Runnable {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ int zzc;

    public /* synthetic */ zzade(zzadl zzadlVar, long j, int i) {
        this.zza = zzadlVar;
        this.zzb = j;
        this.zzc = i;
    }

    public final /* synthetic */ void run() {
        this.zza.zzo(this.zzb, this.zzc);
    }
}
