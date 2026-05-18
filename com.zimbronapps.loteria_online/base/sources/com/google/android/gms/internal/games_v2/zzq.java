package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzq extends a {
    public static final Parcelable.Creator CREATOR = new zzr();
    private final int zza;
    private final zzx zzb;

    public zzq(int i, zzx zzxVar) {
        this.zza = i;
        this.zzb = zzxVar;
    }

    public static zzq zzb(int i) {
        return new zzq(i, null);
    }

    public static zzq zzc(int i, zzx zzxVar) {
        return new zzq(i, zzxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && r.b(this.zzb, zzqVar.zzb);
    }

    public final int hashCode() {
        return r.c(new Object[]{Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return r.d(this).a("signInType", Integer.valueOf(this.zza)).a("previousStepResolutionResult", this.zzb).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, i, false);
        c.b(parcel, a);
    }

    public final int zza() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb == null;
    }
}
