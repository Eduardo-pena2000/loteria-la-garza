package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzah implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AlternativeBillingOnlyAvailabilityListener zzb;

    public /* synthetic */ zzah(a aVar, AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        this.zza = aVar;
        this.zzb = alternativeBillingOnlyAvailabilityListener;
    }

    public final Object call() {
        a.g(this.zza, this.zzb);
        return null;
    }
}
