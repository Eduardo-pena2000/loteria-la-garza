package com.google.android.gms.internal.ads;

import S5.d1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ d1 zzb;
    final /* synthetic */ zzfsa zzc;

    public zzfrs(zzfsa zzfsaVar, long j, d1 d1Var) {
        this.zza = j;
        this.zzb = d1Var;
        Objects.requireNonNull(zzfsaVar);
        this.zzc = zzfsaVar;
    }

    public final void run() {
        zzfsa zzfsaVar = this.zzc;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzI = zzfsaVar.zzI();
            long j = this.zza;
            d1 d1Var = this.zzb;
            zzI.zzi(j, zzfsa.zzL(d1Var), zzfsaVar.zzK(), zzfsaVar.zze.d, zzfsaVar.zzp(), zzfsaVar.zzH());
        }
    }
}
