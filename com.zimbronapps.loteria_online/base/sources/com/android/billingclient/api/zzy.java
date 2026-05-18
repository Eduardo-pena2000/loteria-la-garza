package com.android.billingclient.api;

import android.app.Activity;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzy implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener zzb;
    public final /* synthetic */ Activity zzc;
    public final /* synthetic */ ResultReceiver zzd;

    public /* synthetic */ zzy(a aVar, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, Activity activity, ResultReceiver resultReceiver) {
        this.zza = aVar;
        this.zzb = alternativeBillingOnlyInformationDialogListener;
        this.zzc = activity;
        this.zzd = resultReceiver;
    }

    public final Object call() {
        a.k1(this.zza, this.zzb, this.zzc, this.zzd);
        return null;
    }
}
