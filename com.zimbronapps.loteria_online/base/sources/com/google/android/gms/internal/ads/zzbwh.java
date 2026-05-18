package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwh extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbwi();
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzbwh(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzbwh zza(L5.A a) {
        return new zzbwh(a.a(), a.c(), a.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwh)) {
            zzbwh zzbwhVar = (zzbwh) obj;
            if (zzbwhVar.zzc == this.zzc && zzbwhVar.zzb == this.zzb && zzbwhVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i3).length());
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.zzb);
        y6.c.t(parcel, 3, this.zzc);
        y6.c.b(parcel, a);
    }
}
