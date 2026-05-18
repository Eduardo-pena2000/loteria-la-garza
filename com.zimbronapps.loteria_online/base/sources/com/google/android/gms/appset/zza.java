package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zza extends a {
    public static final Parcelable.Creator CREATOR = new zzb();
    private final String zza;
    private final String zzb;

    public zza(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 1, this.zza, false);
        c.E(parcel, 2, this.zzb, false);
        c.b(parcel, a);
    }
}
