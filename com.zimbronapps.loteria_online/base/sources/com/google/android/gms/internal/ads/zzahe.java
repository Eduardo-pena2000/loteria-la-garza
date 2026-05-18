package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzahe extends zzaeg {
    public zzahe(zzafh zzafhVar, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzafhVar);
        zzahc zzahcVar = new zzahc(zzafhVar);
        zzahd zzahdVar = new zzahd(zzafhVar, i, null);
        long zza = zzafhVar.zza();
        long j4 = zzafhVar.zzj;
        int i2 = zzafhVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzafhVar.zzc) / 2) + 1;
        } else {
            int i3 = zzafhVar.zza;
            long j5 = 4096;
            if (i3 == zzafhVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzafhVar.zzg) * zzafhVar.zzh) / 8) + 64;
        }
        super(zzahcVar, zzahdVar, zza, 0L, j4, j, j2, j3, Math.max(6, zzafhVar.zzc));
    }
}
