package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcgr implements Runnable {
    private final /* synthetic */ zzcgw zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ int zzc;

    public /* synthetic */ zzcgr(zzcgw zzcgwVar, int i, int i2) {
        this.zza = zzcgwVar;
        this.zzb = i;
        this.zzc = i2;
    }

    public final /* synthetic */ void run() {
        this.zza.zzN(this.zzb, this.zzc);
    }
}
