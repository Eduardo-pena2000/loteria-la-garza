package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhsq extends zzhuu {
    private final zzhsp zza;

    private zzhsq(zzhsp zzhspVar) {
        this.zza = zzhspVar;
    }

    public static zzhsq zzb(zzhsp zzhspVar) {
        return new zzhsq(zzhspVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhsq) && ((zzhsq) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhsq.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 30);
        sb.append("Ed25519 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zza != zzhsp.zzd;
    }

    public final zzhsp zzc() {
        return this.zza;
    }
}
