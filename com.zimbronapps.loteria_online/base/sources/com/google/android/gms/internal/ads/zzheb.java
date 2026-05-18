package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzheb extends zzhch {
    private final zzhea zza;

    private zzheb(zzhea zzheaVar) {
        this.zza = zzheaVar;
    }

    public static zzheb zzb(zzhea zzheaVar) {
        return new zzheb(zzheaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzheb) && ((zzheb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzheb.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("ChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zza != zzhea.zzc;
    }

    public final zzhea zzc() {
        return this.zza;
    }
}
