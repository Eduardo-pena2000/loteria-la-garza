package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgre implements Serializable, zzgrd {
    private final List zza;

    public /* synthetic */ zzgre(List list, byte[] bArr) {
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgre) {
            return this.zza.equals(((zzgre) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public final boolean zza(Object obj) {
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                return true;
            }
            if (!((zzgrd) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
