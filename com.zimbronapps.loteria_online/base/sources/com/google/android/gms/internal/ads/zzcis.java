package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcis implements Runnable {
    private final /* synthetic */ zzcge zza;
    private final /* synthetic */ Map zzb;

    public /* synthetic */ zzcis(zzcge zzcgeVar, Map map) {
        this.zza = zzcgeVar;
        this.zzb = map;
    }

    public final /* synthetic */ void run() {
        int i = zzcit.zza;
        this.zza.zze("onGcacheInfoEvent", this.zzb);
    }
}
