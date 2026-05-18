package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzar implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;

    public /* synthetic */ zzar(a aVar, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        this.zza = aVar;
        this.zzb = externalOfferReportingDetailsListener;
    }

    public final void run() {
        a.t(this.zza, this.zzb);
    }
}
