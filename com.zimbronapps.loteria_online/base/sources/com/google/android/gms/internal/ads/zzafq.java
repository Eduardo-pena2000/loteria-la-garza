package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzafq implements zzafy {
    private final zzef zza;
    private final zzef zzb;
    private long zzc;

    public zzafq(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgrc.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzef(length2);
            this.zzb = new zzef(length2);
        } else {
            int i = length2 + 1;
            zzef zzefVar = new zzef(i);
            this.zza = zzefVar;
            zzef zzefVar2 = new zzef(i);
            this.zzb = zzefVar2;
            zzefVar.zza(0L);
            zzefVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    public final long zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    public final zzafw zzc(long j) {
        zzef zzefVar = this.zzb;
        if (zzefVar.zzd() == 0) {
            zzafz zzafzVar = zzafz.zza;
            return new zzafw(zzafzVar, zzafzVar);
        }
        int zzn = zzfj.zzn(zzefVar, j, true, true);
        long zzc = zzefVar.zzc(zzn);
        zzef zzefVar2 = this.zza;
        zzafz zzafzVar2 = new zzafz(zzc, zzefVar2.zzc(zzn));
        if (zzafzVar2.zzb == j || zzn == zzefVar.zzd() - 1) {
            return new zzafw(zzafzVar2, zzafzVar2);
        }
        int i = zzn + 1;
        return new zzafw(zzafzVar2, new zzafz(zzefVar.zzc(i), zzefVar2.zzc(i)));
    }
}
