package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzam implements Runnable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ ConsumeResponseListener zzb;
    public final /* synthetic */ ConsumeParams zzc;

    public /* synthetic */ zzam(a aVar, ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = aVar;
        this.zzb = consumeResponseListener;
        this.zzc = consumeParams;
    }

    public final void run() {
        a.j(this.zza, this.zzb, this.zzc);
    }
}
