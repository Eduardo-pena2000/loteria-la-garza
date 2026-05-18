package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaoa implements zzama {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzaoa(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzanq zzanqVar = (zzanq) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzanqVar.zzb;
            jArr[i2 + 1] = zzanqVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    public final int zza() {
        return this.zzc.length;
    }

    public final long zzb(int i) {
        zzgrc.zza(i >= 0);
        long[] jArr = this.zzc;
        zzgrc.zza(i < jArr.length);
        return jArr[i];
    }

    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzanq zzanqVar = (zzanq) list.get(i);
                zzcx zzcxVar = zzanqVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzanqVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, zzanz.zza);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcw zza = ((zzanq) arrayList2.get(i3)).zza.zza();
            zza.zzf((-1) - i3, 1);
            arrayList.add(zza.zzr());
        }
        return arrayList;
    }
}
