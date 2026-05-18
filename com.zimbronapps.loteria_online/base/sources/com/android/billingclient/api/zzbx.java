package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbx implements Runnable {
    public final /* synthetic */ j zza;
    public final /* synthetic */ AcknowledgePurchaseParams zzb;
    public final /* synthetic */ AcknowledgePurchaseResponseListener zzc;

    public /* synthetic */ zzbx(j jVar, AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = jVar;
        this.zzb = acknowledgePurchaseParams;
        this.zzc = acknowledgePurchaseResponseListener;
    }

    public final void run() {
        j.u1(this.zza, this.zzb, this.zzc);
    }
}
