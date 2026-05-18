package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzap implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ProductDetailsResponseListener zzb;

    public /* synthetic */ zzap(a aVar, ProductDetailsResponseListener productDetailsResponseListener) {
        this.zza = aVar;
        this.zzb = productDetailsResponseListener;
    }

    public final void run() {
        a.p(this.zza, this.zzb);
    }
}
