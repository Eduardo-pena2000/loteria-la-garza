package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzejo implements Runnable {
    private final /* synthetic */ zzfsj zza;
    private final /* synthetic */ View zzb;

    public /* synthetic */ zzejo(zzfsj zzfsjVar, View view) {
        this.zza = zzfsjVar;
        this.zzb = view;
    }

    public final /* synthetic */ void run() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgj)).booleanValue() && zzfsh.zzb()) {
            this.zza.zzd(this.zzb, zzfsq.NOT_VISIBLE, "Ad overlay");
        }
    }
}
