package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgvz implements Comparator {
    public static zzgvz zzb() {
        return zzgvx.zza;
    }

    public static zzgvz zzc(Comparator comparator) {
        return new zzgto(comparator);
    }

    public abstract int compare(Object obj, Object obj2);

    public zzgvz zza() {
        return new zzgwi(this);
    }

    public final zzgvz zzd(zzgqt zzgqtVar) {
        return new zzgta(zzgqtVar, this);
    }
}
