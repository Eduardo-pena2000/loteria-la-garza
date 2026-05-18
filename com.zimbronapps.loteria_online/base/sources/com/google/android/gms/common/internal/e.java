package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e extends y6.a {
    public static final Parcelable.Creator CREATOR = new B();
    public final int a;
    public final String b;

    public e(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.a == this.a && r.b(eVar.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }
}
