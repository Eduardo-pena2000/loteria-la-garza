package com.google.android.gms.internal.ads;

import S5.c1;
import V5.q0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzehp implements zzdct, zzdbi {
    private static final Object zza = new Object();
    private static int zzb;
    private final q0 zzc;
    private final zzehz zzd;

    public zzehp(zzehz zzehzVar, q0 q0Var) {
        this.zzd = zzehzVar;
        this.zzc = q0Var;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) S5.D.c().zzd(zzbhe.zzhg)).intValue();
            }
            if (i < intValue) {
                this.zzd.zza(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    public final void zzdI(c1 c1Var) {
        zzb(false);
    }

    public final void zzg() {
        zzb(true);
    }
}
