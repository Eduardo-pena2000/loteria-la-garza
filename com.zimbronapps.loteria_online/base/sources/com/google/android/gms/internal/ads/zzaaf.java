package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaaf {
    private final int[] zza;
    private final zzyn[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzyn zze;

    public zzaaf(String[] strArr, int[] iArr, zzyn[] zzynVarArr, int[] iArr2, int[][][] iArr3, zzyn zzynVar) {
        this.zza = iArr;
        this.zzb = zzynVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzynVar;
    }

    public final int zza(int i) {
        return this.zza[i];
    }

    public final zzyn zzb(int i) {
        return this.zzb[i];
    }

    public final int zzc(int i, int i2, int i3) {
        return this.zzd[i][i2][i3];
    }

    public final int zzd(int i, int i2, boolean z) {
        zzyn[] zzynVarArr = this.zzb;
        int i3 = zzynVarArr[i].zza(i2).zza;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if ((this.zzd[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int i7 = 0;
        int i8 = 16;
        boolean z2 = false;
        while (i4 < copyOf.length) {
            String str2 = zzynVarArr[i].zza(i2).zza(copyOf[i4]).zzo;
            int i9 = i7 + 1;
            if (i7 == 0) {
                str = str2;
            } else {
                z2 |= !Objects.equals(str, str2);
            }
            i8 = Math.min(i8, this.zzd[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        return z2 ? Math.min(i8, this.zzc[i]) : i8;
    }

    public final zzyn zze() {
        return this.zze;
    }
}
