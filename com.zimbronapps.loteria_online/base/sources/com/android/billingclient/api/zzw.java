package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzw implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ BillingFlowParams zze;
    public final /* synthetic */ Bundle zzf;

    public /* synthetic */ zzw(a aVar, int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) {
        this.zza = aVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
        this.zze = billingFlowParams;
        this.zzf = bundle;
    }

    public final Object call() {
        return a.P0(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
