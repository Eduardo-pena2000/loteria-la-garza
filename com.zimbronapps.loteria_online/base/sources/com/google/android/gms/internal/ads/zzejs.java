package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzejs implements Runnable {
    private final /* synthetic */ zzfsv zza;
    private final /* synthetic */ View zzb;

    public /* synthetic */ zzejs(zzfsv zzfsvVar, View view) {
        this.zza = zzfsvVar;
        this.zzb = view;
    }

    public final /* synthetic */ void run() {
        this.zza.zzd(this.zzb, zzfsq.NOT_VISIBLE, "Ad overlay");
    }
}
