package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdf extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzdg();
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    public zzdf(int i, String str, Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdf zza(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.zza == zzdfVar.zza && Objects.equals(this.zzb, zzdfVar.zzb) && Objects.equals(this.zzc, zzdfVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = c.a(parcel);
        c.t(parcel, 1, i2);
        c.E(parcel, 2, this.zzb, false);
        c.C(parcel, 3, this.zzc, i, false);
        c.b(parcel, a);
    }
}
