package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpt extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbpu();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public zzbpt(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.F(parcel, 2, this.zzb, false);
        y6.c.F(parcel, 3, this.zzc, false);
        y6.c.b(parcel, a);
    }
}
