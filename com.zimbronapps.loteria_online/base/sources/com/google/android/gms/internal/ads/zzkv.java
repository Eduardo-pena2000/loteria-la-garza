package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzkv implements Runnable {
    private final /* synthetic */ zzlf zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ boolean zzc;

    public /* synthetic */ zzkv(zzlf zzlfVar, int i, boolean z) {
        this.zza = zzlfVar;
        this.zzb = i;
        this.zzc = z;
    }

    public final /* synthetic */ void run() {
        this.zza.zzu(this.zzb, this.zzc);
    }
}
