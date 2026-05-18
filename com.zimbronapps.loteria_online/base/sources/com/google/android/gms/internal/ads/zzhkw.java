package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhkw {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhkw(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhkw)) {
            return false;
        }
        zzhkw zzhkwVar = (zzhkw) obj;
        return zzhkwVar.zza.equals(this.zza) && zzhkwVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb.append(simpleName);
        sb.append(" with primitive type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
