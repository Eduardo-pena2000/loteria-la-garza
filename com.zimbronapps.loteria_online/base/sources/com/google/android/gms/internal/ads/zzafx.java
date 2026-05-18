package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzafx implements zzafy {
    private final long zza;
    private final zzafw zzb;

    public zzafx(long j, long j2) {
        this.zza = j;
        zzafz zzafzVar = j2 == 0 ? zzafz.zza : new zzafz(0L, j2);
        this.zzb = new zzafw(zzafzVar, zzafzVar);
    }

    public final long zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return false;
    }

    public final zzafw zzc(long j) {
        return this.zzb;
    }
}
