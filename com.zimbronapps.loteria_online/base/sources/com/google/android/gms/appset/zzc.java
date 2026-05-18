package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzc extends a {
    public static final Parcelable.Creator CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 1, this.zza, false);
        c.t(parcel, 2, this.zzb);
        c.b(parcel, a);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
