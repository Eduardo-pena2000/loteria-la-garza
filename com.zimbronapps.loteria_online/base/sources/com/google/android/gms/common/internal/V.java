package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v extends y6.a {
    public static final Parcelable.Creator CREATOR = new d0();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public v(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public int M1() {
        return this.d;
    }

    public int N1() {
        return this.e;
    }

    public boolean O1() {
        return this.b;
    }

    public boolean P1() {
        return this.c;
    }

    public int Q1() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, Q1());
        y6.c.g(parcel, 2, O1());
        y6.c.g(parcel, 3, P1());
        y6.c.t(parcel, 4, M1());
        y6.c.t(parcel, 5, N1());
        y6.c.b(parcel, a);
    }
}
