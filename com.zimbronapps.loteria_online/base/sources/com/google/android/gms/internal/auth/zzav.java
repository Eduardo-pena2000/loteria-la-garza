package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzav extends a {
    public static final Parcelable.Creator CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i, String str, int i2) {
        this.zza = 1;
        this.zzb = (String) t.l(str);
        this.zzc = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.E(parcel, 2, this.zzb, false);
        c.t(parcel, 3, this.zzc);
        c.b(parcel, a);
    }

    public zzav(String str, int i) {
        this(1, str, i);
    }
}
