package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzs extends a {
    public static final Parcelable.Creator CREATOR = new zzt();
    private final String zza;

    public zzs(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return r.b(this.zza, ((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return r.c(new Object[]{this.zza});
    }

    public final String toString() {
        return r.d(this).a("gameRunToken", this.zza).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = c.a(parcel);
        c.E(parcel, 1, str, false);
        c.b(parcel, a);
    }

    public final String zza() {
        return this.zza;
    }
}
