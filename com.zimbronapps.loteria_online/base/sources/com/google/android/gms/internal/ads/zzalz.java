package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzalz {
    public static void zza(zzama zzamaVar, zzame zzameVar, zzdr zzdrVar) {
        for (int i = 0; i < zzamaVar.zza(); i++) {
            long zzb = zzamaVar.zzb(i);
            List zzc = zzamaVar.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i == zzamaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long zzb2 = zzamaVar.zzb(i + 1) - zzamaVar.zzb(i);
                if (zzb2 > 0) {
                    zzdrVar.zza(new zzalx(zzc, zzb, zzb2));
                }
            }
        }
    }
}
