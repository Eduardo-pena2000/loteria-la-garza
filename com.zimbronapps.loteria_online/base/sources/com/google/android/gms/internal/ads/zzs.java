package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public /* synthetic */ zzs(SparseBooleanArray sparseBooleanArray, byte[] bArr) {
        this.zza = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.zza.equals(((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i) {
        return this.zza.get(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgrc.zzm(i, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i);
    }
}
