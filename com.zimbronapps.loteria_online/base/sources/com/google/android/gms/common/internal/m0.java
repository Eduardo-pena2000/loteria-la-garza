package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new n0();
    public Bundle a;
    public v6.d[] b;
    public int c;
    public g d;

    public m0(Bundle bundle, v6.d[] dVarArr, int i, g gVar) {
        this.a = bundle;
        this.b = dVarArr;
        this.c = i;
        this.d = gVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.j(parcel, 1, this.a, false);
        y6.c.H(parcel, 2, this.b, i, false);
        y6.c.t(parcel, 3, this.c);
        y6.c.C(parcel, 4, this.d, i, false);
        y6.c.b(parcel, a);
    }
}
