package com.android.billingclient.api;

import android.app.Activity;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzbz implements Callable {
    public final /* synthetic */ j zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ BillingFlowParams zzc;

    public /* synthetic */ zzbz(j jVar, Activity activity, BillingFlowParams billingFlowParams) {
        this.zza = jVar;
        this.zzb = activity;
        this.zzc = billingFlowParams;
    }

    public final Object call() {
        return j.t1(this.zza, this.zzb, this.zzc);
    }
}
