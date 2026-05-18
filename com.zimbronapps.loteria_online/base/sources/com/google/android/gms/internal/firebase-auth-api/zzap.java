package com.google.android.gms.internal.firebase-auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzap extends zzah {
    static final zzah zza = new zzap(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzap(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final Object get(int i) {
        zzu.zza(i, this.zzc);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    public final int zzb() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzc;
    }
}
