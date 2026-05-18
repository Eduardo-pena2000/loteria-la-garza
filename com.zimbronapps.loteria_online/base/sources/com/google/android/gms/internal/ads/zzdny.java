package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdny implements Runnable {
    private final /* synthetic */ zzdoc zza;
    private final /* synthetic */ View zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ int zzd;

    public /* synthetic */ zzdny(zzdoc zzdocVar, View view, boolean z, int i) {
        this.zza = zzdocVar;
        this.zzb = view;
        this.zzc = z;
        this.zzd = i;
    }

    public final /* synthetic */ void run() {
        this.zza.zzX(this.zzb, this.zzc, this.zzd);
    }
}
