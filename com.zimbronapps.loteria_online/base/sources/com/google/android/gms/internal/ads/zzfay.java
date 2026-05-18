package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfay implements Runnable {
    private final /* synthetic */ zzfba zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzfax zzc;
    private final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzfay(zzfba zzfbaVar, long j, zzfax zzfaxVar, Bundle bundle) {
        this.zza = zzfbaVar;
        this.zzb = j;
        this.zzc = zzfaxVar;
        this.zzd = bundle;
    }

    public final /* synthetic */ void run() {
        this.zza.zzb(this.zzb, this.zzc, this.zzd);
    }
}
