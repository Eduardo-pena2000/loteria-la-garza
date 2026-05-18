package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzam extends a {
    public static final Parcelable.Creator CREATOR = new zzan();

    @Deprecated
    private final String zza;
    private final String zzb;

    public zzam(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzamVar = (zzam) obj;
        return r.b(this.zza, zzamVar.zza) && r.b(this.zzb, zzamVar.zzb);
    }

    public final int hashCode() {
        return r.c(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return r.d(this).a("serverAuthCode", this.zza).a("sessionId", this.zzb).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = c.a(parcel);
        c.E(parcel, 1, str, false);
        c.E(parcel, 2, this.zzb, false);
        c.b(parcel, a);
    }

    public final String zza() {
        return this.zzb;
    }
}
