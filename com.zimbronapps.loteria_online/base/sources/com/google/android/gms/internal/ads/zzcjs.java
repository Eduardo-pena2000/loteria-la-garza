package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcjs implements Runnable {
    private final /* synthetic */ zzcjw zza;

    public /* synthetic */ zzcjs(zzcjw zzcjwVar) {
        this.zza = zzcjwVar;
    }

    public final /* synthetic */ void run() {
        zzcjl zzcjlVar = this.zza.zza;
        zzcjlVar.zzah();
        U5.z zzL = zzcjlVar.zzL();
        if (zzL != null) {
            zzL.zzv();
        }
    }
}
