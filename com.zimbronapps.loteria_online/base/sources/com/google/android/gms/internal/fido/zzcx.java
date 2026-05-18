package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcx extends zzcs implements Serializable {
    final zzcs zza;

    public zzcx(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.zza.equals(((zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    public final zzcs zza() {
        return this.zza;
    }
}
