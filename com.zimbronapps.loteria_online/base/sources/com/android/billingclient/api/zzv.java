package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzv implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ExternalOfferAvailabilityListener zzb;

    public /* synthetic */ zzv(a aVar, ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        this.zza = aVar;
        this.zzb = externalOfferAvailabilityListener;
    }

    public final void run() {
        a.o(this.zza, this.zzb);
    }
}
