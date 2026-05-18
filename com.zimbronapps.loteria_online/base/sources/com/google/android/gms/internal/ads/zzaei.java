package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaei implements zzafy {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaei(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        int i = this.zza;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }

    public final long zza() {
        return this.zzf;
    }

    public final boolean zzb() {
        return true;
    }

    public final zzafw zzc(long j) {
        long[] jArr = this.zze;
        int zzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[zzm];
        long[] jArr2 = this.zzc;
        zzafz zzafzVar = new zzafz(j2, jArr2[zzm]);
        if (zzafzVar.zzb >= j || zzm == this.zza - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i = zzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i], jArr2[i]));
    }
}
