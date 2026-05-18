package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzegj implements Callable {
    private final /* synthetic */ x7.e zza;
    private final /* synthetic */ x7.e zzb;

    public /* synthetic */ zzegj(x7.e eVar, x7.e eVar2) {
        this.zza = eVar;
        this.zzb = eVar2;
    }

    public final /* synthetic */ Object call() {
        zzegz zzegzVar = (zzegz) this.zza.get();
        x7.e eVar = this.zzb;
        return new zzegt(zzegzVar, ((zzegr) eVar.get()).zzb, ((zzegr) eVar.get()).zza);
    }
}
