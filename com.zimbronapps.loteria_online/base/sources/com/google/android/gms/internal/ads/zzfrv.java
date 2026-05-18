package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrv implements Runnable {
    final /* synthetic */ zzfsa zza;

    public zzfrv(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    public final void run() {
        zzfsa zzfsaVar = this.zza;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzI = zzfsaVar.zzI();
            E6.f zzJ = zzfsaVar.zzJ();
            zzI.zzj(zzJ.a(), zzfsaVar.zzK(), zzfsaVar.zze.d, zzfsaVar.zzH());
        }
    }
}
