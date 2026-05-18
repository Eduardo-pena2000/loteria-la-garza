package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbs implements Runnable {
    public final /* synthetic */ j zza;
    public final /* synthetic */ QueryProductDetailsParams zzb;
    public final /* synthetic */ ProductDetailsResponseListener zzc;

    public /* synthetic */ zzbs(j jVar, QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        this.zza = jVar;
        this.zzb = queryProductDetailsParams;
        this.zzc = productDetailsResponseListener;
    }

    public final void run() {
        j.w1(this.zza, this.zzb, this.zzc);
    }
}
