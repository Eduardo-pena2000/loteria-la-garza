package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzecs implements Runnable {
    private final /* synthetic */ zzect zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzecs(zzect zzectVar, Context context) {
        this.zza = zzectVar;
        this.zzb = context;
    }

    public final /* synthetic */ void run() {
        this.zza.zzc(this.zzb);
    }
}
