package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdai implements Callable {
    private final /* synthetic */ zzdaj zza;
    private final /* synthetic */ x7.e zzb;
    private final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzdai(zzdaj zzdajVar, x7.e eVar, Bundle bundle) {
        this.zza = zzdajVar;
        this.zzb = eVar;
        this.zzc = bundle;
    }

    public final /* synthetic */ Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
