package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwh extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzfwi();
    public final int zza;
    public final byte[] zzb;

    public zzfwh(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.k(parcel, 2, this.zzb, false);
        y6.c.b(parcel, a);
    }

    public zzfwh(byte[] bArr) {
        this(1, bArr);
    }
}
