package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgtq extends zzgts {
    public zzgtq() {
        super(null);
    }

    public static final zzgts zzf(int i) {
        return i < 0 ? zzgts.zzi() : i > 0 ? zzgts.zzj() : zzgts.zzh();
    }

    public final zzgts zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzgts zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    public final zzgts zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    public final zzgts zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    public final int zze() {
        return 0;
    }
}
