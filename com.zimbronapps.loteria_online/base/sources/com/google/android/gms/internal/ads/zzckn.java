package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzckn implements Runnable {
    private final /* synthetic */ zzcko zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ ValueCallback zzc;

    public /* synthetic */ zzckn(zzcko zzckoVar, String str, ValueCallback valueCallback) {
        this.zza = zzckoVar;
        this.zzb = str;
        this.zzc = valueCallback;
    }

    public final /* synthetic */ void run() {
        this.zza.zzaU(this.zzb, this.zzc);
    }
}
