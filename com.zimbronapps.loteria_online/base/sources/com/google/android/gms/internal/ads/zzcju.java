package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcju implements Runnable {
    private final /* synthetic */ zzcjw zza;
    private final /* synthetic */ View zzb;
    private final /* synthetic */ zzcce zzc;
    private final /* synthetic */ int zzd;

    public /* synthetic */ zzcju(zzcjw zzcjwVar, View view, zzcce zzcceVar, int i) {
        this.zza = zzcjwVar;
        this.zzb = view;
        this.zzc = zzcceVar;
        this.zzd = i;
    }

    public final /* synthetic */ void run() {
        this.zza.zzU(this.zzb, this.zzc, this.zzd);
    }
}
