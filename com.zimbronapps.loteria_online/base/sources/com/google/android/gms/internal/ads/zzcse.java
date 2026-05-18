package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcse implements Runnable {
    private final /* synthetic */ zzcsh zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ int zzc;

    public /* synthetic */ zzcse(zzcsh zzcshVar, int i, int i2) {
        this.zza = zzcshVar;
        this.zzb = i;
        this.zzc = i2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
