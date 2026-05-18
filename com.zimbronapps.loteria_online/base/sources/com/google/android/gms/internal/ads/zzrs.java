package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzrs implements Runnable {
    private final /* synthetic */ zzru zza;
    private final /* synthetic */ AudioDeviceInfo zzb;

    public /* synthetic */ zzrs(zzru zzruVar, AudioDeviceInfo audioDeviceInfo) {
        this.zza = zzruVar;
        this.zzb = audioDeviceInfo;
    }

    public final /* synthetic */ void run() {
        this.zza.zzc(this.zzb);
    }
}
