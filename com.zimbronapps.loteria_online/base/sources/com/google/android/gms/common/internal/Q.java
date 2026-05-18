package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q extends y6.a {
    public static final Parcelable.Creator CREATOR = new M();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public q(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.b);
        y6.c.t(parcel, 3, this.c);
        y6.c.x(parcel, 4, this.d);
        y6.c.x(parcel, 5, this.e);
        y6.c.E(parcel, 6, this.f, false);
        y6.c.E(parcel, 7, this.g, false);
        y6.c.t(parcel, 8, this.h);
        y6.c.t(parcel, 9, this.i);
        y6.c.b(parcel, a);
    }
}
