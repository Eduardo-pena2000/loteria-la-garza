package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzaf implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AlternativeBillingOnlyReportingDetailsListener zzb;

    public /* synthetic */ zzaf(a aVar, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        this.zza = aVar;
        this.zzb = alternativeBillingOnlyReportingDetailsListener;
    }

    public final Object call() {
        a.f(this.zza, this.zzb);
        return null;
    }
}
