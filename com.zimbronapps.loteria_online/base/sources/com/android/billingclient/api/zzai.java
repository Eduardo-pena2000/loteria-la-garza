package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzai implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AlternativeBillingOnlyAvailabilityListener zzb;

    public /* synthetic */ zzai(a aVar, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        this.zza = aVar;
        this.zzb = alternativeBillingOnlyAvailabilityListener;
    }

    public final void run() {
        a.m(this.zza, this.zzb);
    }
}
