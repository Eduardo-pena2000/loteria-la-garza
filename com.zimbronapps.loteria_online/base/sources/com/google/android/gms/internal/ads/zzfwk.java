package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwk extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzfwl();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzfwk(int i, String str, String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, this.zzb, false);
        y6.c.E(parcel, 3, this.zzc, false);
        y6.c.b(parcel, a);
    }

    public zzfwk(String str, String str2) {
        this(1, str, str2);
    }
}
