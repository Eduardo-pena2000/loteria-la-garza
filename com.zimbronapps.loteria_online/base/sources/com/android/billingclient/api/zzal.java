package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzal implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ProductDetailsResponseListener zzb;
    public final /* synthetic */ QueryProductDetailsParams zzc;

    public /* synthetic */ zzal(a aVar, ProductDetailsResponseListener productDetailsResponseListener, QueryProductDetailsParams queryProductDetailsParams) {
        this.zza = aVar;
        this.zzb = productDetailsResponseListener;
        this.zzc = queryProductDetailsParams;
    }

    public final Object call() {
        a.d1(this.zza, this.zzb, this.zzc);
        return null;
    }
}
