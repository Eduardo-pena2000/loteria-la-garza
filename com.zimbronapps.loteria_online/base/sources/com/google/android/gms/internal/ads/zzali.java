package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzali implements zzalp {
    private final zzalo zza;
    private final long zzb;
    private final long zzc;
    private final zzalt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzali(zzalt zzaltVar, long j, long j2, long j3, long j4, boolean z) {
        zzgrc.zza(j >= 0 && j2 > j);
        this.zzd = zzaltVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzalo();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza(com.google.android.gms.internal.ads.zzaev r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zza(com.google.android.gms.internal.ads.zzaev):long");
    }

    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzfj.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    public final /* bridge */ /* synthetic */ zzafy zzc() {
        if (this.zzf != 0) {
            return new zzalh(this, null);
        }
        return null;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzalt zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzf;
    }
}
