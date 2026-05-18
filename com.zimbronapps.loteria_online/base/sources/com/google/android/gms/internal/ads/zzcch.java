package com.google.android.gms.internal.ads;

import V5.o0;
import V5.q0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcch {
    private final q0 zza;

    public zzcch(E6.f fVar, q0 q0Var, zzccq zzccqVar) {
        this.zza = q0Var;
    }

    public final void zza(int i, long j) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzba)).booleanValue()) {
            return;
        }
        q0 q0Var = this.zza;
        if (j - q0Var.zzF() < 0) {
            o0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzbb)).booleanValue()) {
            q0Var.g(i);
            q0Var.e(j);
        } else {
            q0Var.g(-1);
            q0Var.e(j);
        }
    }
}
