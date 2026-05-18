package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbqs extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbqt();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbqs(int i, int i2, String str, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, this.zzc, false);
        y6.c.t(parcel, 3, this.zzd);
        y6.c.t(parcel, 1000, this.zza);
        y6.c.b(parcel, a);
    }
}
