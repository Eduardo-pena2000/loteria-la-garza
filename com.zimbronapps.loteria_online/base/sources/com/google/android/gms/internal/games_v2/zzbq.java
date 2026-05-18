package com.google.android.gms.internal.games_v2;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbq {
    private final String zza;
    private final Status zzb;

    private zzbq(Status status, String str) {
        this.zzb = status;
        this.zza = str;
    }

    public static zzbq zzb(Status status) {
        t.a(!status.R1());
        return new zzbq(status, null);
    }

    public static zzbq zzc(String str) {
        return new zzbq(Status.f, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return false;
        }
        zzbq zzbqVar = (zzbq) obj;
        return r.b(this.zzb, zzbqVar.zzb) && r.b(this.zza, zzbqVar.zza);
    }

    public final int hashCode() {
        return r.c(new Object[]{this.zzb, this.zza});
    }

    public final String toString() {
        return r.d(this).a("status", this.zzb).a("gameRunToken", this.zza).toString();
    }

    public final PendingIntent zza() {
        return this.zzb.N1();
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzb.R1();
    }
}
