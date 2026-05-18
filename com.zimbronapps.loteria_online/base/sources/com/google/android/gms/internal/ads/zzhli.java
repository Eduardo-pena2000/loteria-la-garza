package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhli {
    private final Class zza;
    private final zzhye zzb;

    public /* synthetic */ zzhli(Class cls, zzhye zzhyeVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzhyeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhli)) {
            return false;
        }
        zzhli zzhliVar = (zzhli) obj;
        return zzhliVar.zza.equals(this.zza) && zzhliVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzhye zzhyeVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzhyeVar);
        StringBuilder sb = new StringBuilder(simpleName.length() + 21 + valueOf.length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
