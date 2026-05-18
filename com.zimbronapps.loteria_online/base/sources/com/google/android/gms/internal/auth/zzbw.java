package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.E(parcel, 2, this.zzb, false);
        c.b(parcel, a);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }
}
