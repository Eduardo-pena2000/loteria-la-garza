package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcby implements Runnable {
    private final /* synthetic */ zzcbz zza;
    private final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzcby(zzcbz zzcbzVar, Bitmap bitmap) {
        this.zza = zzcbzVar;
        this.zzb = bitmap;
    }

    public final /* synthetic */ void run() {
        this.zza.zzg(this.zzb);
    }
}
