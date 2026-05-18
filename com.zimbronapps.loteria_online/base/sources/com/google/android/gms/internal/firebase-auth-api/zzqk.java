package com.google.android.gms.internal.firebase-auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzqk {
    private final Class zza;
    private final zzaaj zzb;

    public /* synthetic */ zzqk(Class cls, zzaaj zzaajVar, zzqm zzqmVar) {
        this(cls, zzaajVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return zzqkVar.zza.equals(this.zza) && zzqkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }

    private zzqk(Class cls, zzaaj zzaajVar) {
        this.zza = cls;
        this.zzb = zzaajVar;
    }
}
