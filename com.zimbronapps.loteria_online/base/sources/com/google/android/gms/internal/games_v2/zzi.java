package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzi implements a.d {
    public final int zza;
    public final String zzb;

    public /* synthetic */ zzi(int i, String str, zzh zzhVar) {
        this.zza = i;
        this.zzb = str;
    }

    public static zzg zza() {
        return new zzg(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.zza == zziVar.zza && r.b(this.zzb, zziVar.zzb);
    }

    public final int hashCode() {
        return r.c(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }
}
