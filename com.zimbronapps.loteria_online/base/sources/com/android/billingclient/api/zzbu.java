package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbu implements Runnable {
    public final /* synthetic */ j zza;
    public final /* synthetic */ ConsumeParams zzb;
    public final /* synthetic */ ConsumeResponseListener zzc;

    public /* synthetic */ zzbu(j jVar, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        this.zza = jVar;
        this.zzb = consumeParams;
        this.zzc = consumeResponseListener;
    }

    public final void run() {
        j.v1(this.zza, this.zzb, this.zzc);
    }
}
