package com.google.android.gms.internal.ads;

import S5.d1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrr implements Runnable {
    final /* synthetic */ d1 zza;
    final /* synthetic */ zzfsa zzb;

    public zzfrr(zzfsa zzfsaVar, d1 d1Var) {
        this.zza = d1Var;
        Objects.requireNonNull(zzfsaVar);
        this.zzb = zzfsaVar;
    }

    public final void run() {
        this.zzb.zzF(this.zza);
    }
}
