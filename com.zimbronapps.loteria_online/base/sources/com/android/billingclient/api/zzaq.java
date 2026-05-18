package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzaq implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ExternalOfferReportingDetailsListener zzb;

    public /* synthetic */ zzaq(a aVar, ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, String str) {
        this.zza = aVar;
        this.zzb = externalOfferReportingDetailsListener;
    }

    public final Object call() {
        a.e(this.zza, this.zzb, null);
        return null;
    }
}
