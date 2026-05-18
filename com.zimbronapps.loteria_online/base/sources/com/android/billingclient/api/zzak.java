package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzak implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ConsumeResponseListener zzb;
    public final /* synthetic */ ConsumeParams zzc;

    public /* synthetic */ zzak(a aVar, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = aVar;
        this.zzb = consumeResponseListener;
        this.zzc = consumeParams;
    }

    public final Object call() {
        a.c1(this.zza, this.zzb, this.zzc);
        return null;
    }
}
