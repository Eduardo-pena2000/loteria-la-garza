package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwv extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzfww();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfwv(int i, byte[] bArr, int i2) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.k(parcel, 2, this.zzb, false);
        y6.c.t(parcel, 3, this.zzc);
        y6.c.b(parcel, a);
    }

    public zzfwv(byte[] bArr, int i) {
        this(1, null, 1);
    }
}
