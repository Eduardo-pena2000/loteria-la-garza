package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class x extends y6.a {
    public static final Parcelable.Creator CREATOR = new C();
    public final int a;
    public List b;

    public x(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final int M1() {
        return this.a;
    }

    public final List N1() {
        return this.b;
    }

    public final void O1(q qVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(qVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.I(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }
}
