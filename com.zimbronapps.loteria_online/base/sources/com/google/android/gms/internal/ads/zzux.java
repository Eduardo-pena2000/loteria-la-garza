package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzux {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzux(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzux.class) {
            zzux zzuxVar = (zzux) obj;
            if (TextUtils.equals(this.zza, zzuxVar.zza) && this.zzb == zzuxVar.zzb && this.zzc == zzuxVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
