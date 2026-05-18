package com.google.android.gms.internal.firebase-auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzqj {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzqj(Class cls, Class cls2, zzqm zzqmVar) {
        this(cls, cls2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        return zzqjVar.zza.equals(this.zza) && zzqjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with serialization type: " + this.zzb.getSimpleName();
    }

    private zzqj(Class cls, Class cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
