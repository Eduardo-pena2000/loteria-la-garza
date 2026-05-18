package com.google.android.gms.internal.ads;

import S5.c1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrt implements Runnable {
    final /* synthetic */ c1 zza;
    final /* synthetic */ zzfsa zzb;

    public zzfrt(zzfsa zzfsaVar, c1 c1Var) {
        this.zza = c1Var;
        Objects.requireNonNull(zzfsaVar);
        this.zzb = zzfsaVar;
    }

    public final void run() {
        this.zzb.zzE(this.zza);
    }
}
