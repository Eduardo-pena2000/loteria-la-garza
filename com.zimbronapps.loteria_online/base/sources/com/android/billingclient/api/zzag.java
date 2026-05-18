package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzag implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AlternativeBillingOnlyReportingDetailsListener zzb;

    public /* synthetic */ zzag(a aVar, AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        this.zza = aVar;
        this.zzb = alternativeBillingOnlyReportingDetailsListener;
    }

    public final void run() {
        a.u(this.zza, this.zzb);
    }
}
