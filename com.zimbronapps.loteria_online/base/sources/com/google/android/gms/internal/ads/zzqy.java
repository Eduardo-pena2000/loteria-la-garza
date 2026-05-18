package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzqy implements Runnable {
    private final /* synthetic */ zzrb zza;
    private final /* synthetic */ Exception zzb;

    public /* synthetic */ zzqy(zzrb zzrbVar, Exception exc) {
        this.zza = zzrbVar;
        this.zzb = exc;
    }

    public final /* synthetic */ void run() {
        this.zza.zzx(this.zzb);
    }
}
