package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeme implements zzdmc {
    private final zzfir zza;
    private final zzbvs zzb;
    private final L5.c zzc;
    private zzdbx zzd = null;

    public zzeme(zzfir zzfirVar, zzbvs zzbvsVar, L5.c cVar) {
        this.zza = zzfirVar;
        this.zzb = zzbvsVar;
        this.zzc = cVar;
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) throws zzdmb {
        boolean zzk;
        try {
            L5.c cVar = L5.c.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzk = this.zzb.zzk(N6.b.s1(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzk = this.zzb.zzt(N6.b.s1(context));
                    }
                    throw new zzdmb("Adapter failed to show.");
                }
                zzk = this.zzb.zzm(N6.b.s1(context));
            }
            if (zzk) {
                zzdbx zzdbxVar = this.zzd;
                if (zzdbxVar == null) {
                    return;
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzcc)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdbxVar.zza();
                return;
            }
            throw new zzdmb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdmb(th);
        }
    }

    public final zzfir zzb() {
        return this.zza;
    }

    public final void zzc(zzdbx zzdbxVar) {
        this.zzd = zzdbxVar;
    }
}
