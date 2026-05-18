package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaiv {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzaiv(long j, long j2, int i) {
        zzgrc.zza(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiv.class == obj.getClass()) {
            zzaiv zzaivVar = (zzaiv) obj;
            if (this.zza == zzaivVar.zza && this.zzb == zzaivVar.zzb && this.zzc == zzaivVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzfj.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
