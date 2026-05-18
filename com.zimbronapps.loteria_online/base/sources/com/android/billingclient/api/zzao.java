package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzao implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ExternalOfferInformationDialogListener zzb;

    public /* synthetic */ zzao(a aVar, ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        this.zza = aVar;
        this.zzb = externalOfferInformationDialogListener;
    }

    public final void run() {
        a.s(this.zza, this.zzb);
    }
}
