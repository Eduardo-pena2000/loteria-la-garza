package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgta extends zzgvz implements Serializable {
    final zzgqt zza;
    final zzgvz zzb;

    public zzgta(zzgqt zzgqtVar, zzgvz zzgvzVar) {
        this.zza = zzgqtVar;
        this.zzb = zzgvzVar;
    }

    public final int compare(Object obj, Object obj2) {
        zzgqt zzgqtVar = this.zza;
        return this.zzb.compare(zzgqtVar.apply(obj), zzgqtVar.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgta) {
            zzgta zzgtaVar = (zzgta) obj;
            if (this.zza.equals(zzgtaVar.zza) && this.zzb.equals(zzgtaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String obj = this.zzb.toString();
        int length = obj.length();
        String obj2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + obj2.length() + 1);
        sb.append(obj);
        sb.append(".onResultOf(");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
