package com.google.android.gms.internal.firebase-auth-api;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzau extends zzah {
    private final /* synthetic */ zzar zza;

    public zzau(zzar zzarVar) {
        Objects.requireNonNull(zzarVar);
        this.zza = zzarVar;
    }

    public final /* synthetic */ Object get(int i) {
        zzu.zza(i, zzar.zza(this.zza));
        int i2 = i * 2;
        Object obj = zzar.zzb(this.zza)[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzar.zzb(this.zza)[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return zzar.zza(this.zza);
    }
}
