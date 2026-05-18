package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfh extends a {
    public static final Parcelable.Creator CREATOR = new zzfi();
    final H6.a zzes;
    final boolean zzhv;

    public zzfh(H6.a aVar, boolean z) {
        this.zzes = aVar;
        this.zzhv = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzes, i, false);
        c.g(parcel, 3, this.zzhv);
        c.b(parcel, a);
    }

    public final H6.a zzar() {
        return this.zzes;
    }
}
