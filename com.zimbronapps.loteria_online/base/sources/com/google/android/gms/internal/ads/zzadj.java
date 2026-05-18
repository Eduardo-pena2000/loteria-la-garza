package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzadj implements Runnable {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ Exception zzb;

    public /* synthetic */ zzadj(zzadl zzadlVar, Exception exc) {
        this.zza = zzadlVar;
        this.zzb = exc;
    }

    public final /* synthetic */ void run() {
        this.zza.zzt(this.zzb);
    }
}
