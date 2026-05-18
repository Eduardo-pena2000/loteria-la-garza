package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzagr implements zzafy {
    final /* synthetic */ zzagt zza;
    private final long zzb;

    public zzagr(zzagt zzagtVar, long j) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return true;
    }

    public final zzafw zzc(long j) {
        zzagt zzagtVar = this.zza;
        zzafw zzg = zzagtVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzagtVar.zzh().length; i++) {
            zzafw zzg2 = zzagtVar.zzh()[i].zzg(j);
            if (zzg2.zza.zzc < zzg.zza.zzc) {
                zzg = zzg2;
            }
        }
        return zzg;
    }
}
