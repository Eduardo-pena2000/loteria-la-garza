package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzx implements Callable {
    public final /* synthetic */ a zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzx(a aVar, String str, String str2) {
        this.zza = aVar;
        this.zzb = str;
        this.zzc = str2;
    }

    public final Object call() {
        return a.O0(this.zza, this.zzb, this.zzc);
    }
}
