package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzalj implements zzalp {
    private final zzafh zza;
    private final zzafg zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzalj(zzafh zzafhVar, zzafg zzafgVar) {
        this.zza = zzafhVar;
        this.zzb = zzafgVar;
    }

    public final long zza(zzaev zzaevVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    public final void zzb(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfj.zzm(jArr, j, true, true)];
    }

    public final zzafy zzc() {
        zzgrc.zzi(this.zzc != -1);
        return new zzaff(this.zza, this.zzc);
    }

    public final void zzd(long j) {
        this.zzc = j;
    }
}
