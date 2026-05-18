package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfcr implements Callable {
    private final /* synthetic */ x7.e zza;
    private final /* synthetic */ x7.e zzb;

    public /* synthetic */ zzfcr(x7.e eVar, x7.e eVar2) {
        this.zza = eVar;
        this.zzb = eVar2;
    }

    public final /* synthetic */ Object call() {
        return new zzfct((String) this.zza.get(), (String) this.zzb.get());
    }
}
