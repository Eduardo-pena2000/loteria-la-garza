package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwt extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzfwu();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfwt(int i, int i2, int i3, String str, String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.zzb);
        y6.c.E(parcel, 3, this.zzc, false);
        y6.c.E(parcel, 4, this.zzd, false);
        y6.c.t(parcel, 5, this.zze);
        y6.c.b(parcel, a);
    }

    public zzfwt(int i, zzbch zzbchVar, String str, String str2) {
        this(1, 1, zzbchVar.zza(), str, str2);
    }
}
