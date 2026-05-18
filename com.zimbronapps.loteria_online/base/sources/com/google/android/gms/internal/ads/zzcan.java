package com.google.android.gms.internal.ads;

import S5.l2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcan extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzcao();
    public final l2 zza;
    public final String zzb;

    public zzcan(l2 l2Var, String str) {
        this.zza = l2Var;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        l2 l2Var = this.zza;
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 2, l2Var, i, false);
        y6.c.E(parcel, 3, this.zzb, false);
        y6.c.b(parcel, a);
    }
}
