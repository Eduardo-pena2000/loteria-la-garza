package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzajf implements zzafy {
    private final zzaei zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzajf(SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.zzb = sparseArray;
        this.zzc = j;
        this.zzd = i;
        List list = (List) sparseArray.get(i);
        zzaei zzaeiVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                zzaje zzajeVar = (zzaje) list.get(i4);
                jArr3[i4] = zzajeVar.zza();
                jArr[i4] = zzajeVar.zzb();
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                zzee.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            zzaeiVar = new zzaei(iArr, jArr, jArr2, jArr3);
        }
        this.zza = zzaeiVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final zzafw zzc(long j) {
        zzaei zzaeiVar = this.zza;
        if (zzaeiVar != null) {
            return zzaeiVar.zzc(j);
        }
        zzafz zzafzVar = zzafz.zza;
        return new zzafw(zzafzVar, zzafzVar);
    }
}
