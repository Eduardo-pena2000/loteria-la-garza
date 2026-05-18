package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfm implements Runnable {
    private final /* synthetic */ zzfo zza;
    private final /* synthetic */ Runnable zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ boolean zzd;

    public /* synthetic */ zzfm(zzfo zzfoVar, Runnable runnable, boolean z, boolean z2) {
        this.zza = zzfoVar;
        this.zzb = runnable;
        this.zzc = z;
        this.zzd = z2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzc(this.zzb, this.zzc, this.zzd);
    }
}
