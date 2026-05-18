package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g extends y6.a {
    public static final Parcelable.Creator CREATOR = new o0();
    public final v a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public g(v vVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = vVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    public int M1() {
        return this.e;
    }

    public int[] N1() {
        return this.d;
    }

    public int[] O1() {
        return this.f;
    }

    public boolean P1() {
        return this.b;
    }

    public boolean Q1() {
        return this.c;
    }

    public final v R1() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.g(parcel, 2, P1());
        y6.c.g(parcel, 3, Q1());
        y6.c.u(parcel, 4, N1(), false);
        y6.c.t(parcel, 5, M1());
        y6.c.u(parcel, 6, O1(), false);
        y6.c.b(parcel, a);
    }
}
