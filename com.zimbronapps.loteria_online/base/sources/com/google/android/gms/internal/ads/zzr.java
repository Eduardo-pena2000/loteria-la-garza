package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i) {
        zzgrc.zzi(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzs zzb() {
        zzgrc.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
