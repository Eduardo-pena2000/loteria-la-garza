package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzclq implements Runnable {
    private final /* synthetic */ zzclt zza;
    private final /* synthetic */ Context zzb;
    private final /* synthetic */ W5.a zzc;

    public /* synthetic */ zzclq(zzclt zzcltVar, Context context, W5.a aVar) {
        this.zza = zzcltVar;
        this.zzb = context;
        this.zzc = aVar;
    }

    public final /* synthetic */ void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
