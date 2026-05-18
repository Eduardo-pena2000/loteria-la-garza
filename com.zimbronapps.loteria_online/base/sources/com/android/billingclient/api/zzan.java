package com.android.billingclient.api;

import android.app.Activity;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzan implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ExternalOfferInformationDialogListener zzb;
    public final /* synthetic */ Activity zzc;
    public final /* synthetic */ ResultReceiver zzd;

    public /* synthetic */ zzan(a aVar, ExternalOfferInformationDialogListener externalOfferInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        this.zza = aVar;
        this.zzb = externalOfferInformationDialogListener;
        this.zzc = activity;
        this.zzd = resultReceiver;
    }

    public final Object call() {
        a.d(this.zza, this.zzb, this.zzc, this.zzd);
        return null;
    }
}
