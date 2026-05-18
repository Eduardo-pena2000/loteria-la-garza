package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcke implements Runnable {
    private final /* synthetic */ zzckh zza;
    private final /* synthetic */ zzejz zzb;

    public /* synthetic */ zzcke(zzckh zzckhVar, zzejz zzejzVar) {
        this.zza = zzckhVar;
        this.zzb = zzejzVar;
    }

    public final /* synthetic */ void run() {
        this.zzb.zze(new zzckf(this.zza));
    }
}
