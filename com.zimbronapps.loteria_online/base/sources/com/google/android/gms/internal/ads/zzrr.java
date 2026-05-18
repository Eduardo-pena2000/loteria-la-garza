package com.google.android.gms.internal.ads;

import android.media.AudioRouting;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzrr implements Runnable {
    private final /* synthetic */ zzru zza;
    private final /* synthetic */ AudioRouting zzb;

    public /* synthetic */ zzrr(zzru zzruVar, AudioRouting audioRouting) {
        this.zza = zzruVar;
        this.zzb = audioRouting;
    }

    public final /* synthetic */ void run() {
        this.zza.zzb(this.zzb);
    }
}
