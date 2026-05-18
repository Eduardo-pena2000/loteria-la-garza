package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzauu {
    public final ArrayDeque zza = new ArrayDeque();

    public zzauu(int i) {
    }

    public final void zza(long j, long j2, long j3) throws zzaus {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        zzaur zzaurVar = new zzaur(j, j2, j3);
        ArrayDeque arrayDeque = this.zza;
        if (arrayDeque.size() >= ((i8 % 452867621) ^ i9)) {
            throw new zzaus();
        }
        arrayDeque.push(zzaurVar);
    }

    public final zzaur zzb() throws zzaut {
        return (zzaur) Optional.ofNullable((zzaur) this.zza.peek()).orElseThrow(zzauq.zza);
    }
}
