package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzll {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzll(zzlk zzlkVar, byte[] bArr) {
        this.zza = zzlkVar.zze();
        this.zzb = zzlkVar.zzf();
        this.zzc = zzlkVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzll)) {
            return false;
        }
        zzll zzllVar = (zzll) obj;
        return this.zza == zzllVar.zza && this.zzb == zzllVar.zzb && this.zzc == zzllVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzlk zza() {
        return new zzlk(this, null);
    }
}
