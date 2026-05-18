package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzd extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbze();
    public final String zza;

    public zzbzd(String str) {
        this.zza = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.b(parcel, a);
    }
}
