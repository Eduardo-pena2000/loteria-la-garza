package com.google.android.gms.internal.firebase-auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpx {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzpx(Class cls, Class cls2, zzqa zzqaVar) {
        this(cls, cls2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpx)) {
            return false;
        }
        zzpx zzpxVar = (zzpx) obj;
        return zzpxVar.zza.equals(this.zza) && zzpxVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with primitive type: " + this.zzb.getSimpleName();
    }

    private zzpx(Class cls, Class cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
