package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdpe implements Runnable {
    private final /* synthetic */ zzdpg zza;
    private final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdpe(zzdpg zzdpgVar, ViewGroup viewGroup) {
        this.zza = zzdpgVar;
        this.zzb = viewGroup;
    }

    public final /* synthetic */ void run() {
        this.zza.zzg(this.zzb);
    }
}
