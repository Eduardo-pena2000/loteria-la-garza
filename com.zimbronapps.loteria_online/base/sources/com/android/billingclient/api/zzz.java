package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzz implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zzb;

    public /* synthetic */ zzz(a aVar, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        this.zza = aVar;
        this.zzb = alternativeBillingOnlyInformationDialogListener;
    }

    public final void run() {
        a.q(this.zza, this.zzb);
    }
}
